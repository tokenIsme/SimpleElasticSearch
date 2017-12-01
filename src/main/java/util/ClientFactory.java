package util;

import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import common.Constant;
import model._MappingKit;
import org.apache.log4j.Logger;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by yang on 2017/7/11.
 */
public class ClientFactory
{
    
    private static Logger LOG = Logger.getLogger(ClientFactory.class);
    
    private static TransportClient client;
    
    public static TransportClient getClient()
    {
        if (client == null)
        {
            Settings settings = Settings.builder().put("cluster.name", Constant.CLUSTER_NAME).build();
            try
            {
                if (Constant.HOSTS == null)
                {
                    return null;
                }
                for (String host : Constant.HOSTS)
                {
                    LOG.info("发现节点：" + host + "...........正在连接该节点>>>>>>>>>");
                    client = new PreBuiltTransportClient(settings).addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName(host), Constant.CLIENT_PORT));
                }
                
            }
            catch (UnknownHostException e)
            {
                LOG.info("连接es客户端发生错误" + e.toString());
                e.printStackTrace();
            }
        }
        return client;
    }
    
    /**
     * 初始化数据层
     */
    public static void init()
    {
        LOG.info("================读取数据库配置 start==================");
        PropKit.use("a_little_config.txt");
        DruidPlugin dp = new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
        
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        _MappingKit.mapping(arp);
        
        dp.start();
        arp.start();
        
        LOG.info("================读取数据库配置 end==================");
    }
}
