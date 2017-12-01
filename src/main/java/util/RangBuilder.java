package util;

import org.elasticsearch.index.query.RangeQueryBuilder;

import java.util.List;
import java.util.Map;

/**
 * @Author: yang 【youtulu.cn】
 * @Date: 2017/11/30.12:30
 */
public class RangBuilder
{
    
    private String fild;
    
    private List<Map<String, Range>> range;
    
    private void deal()
    {
        RangeQueryBuilder rangeQueryBuilder = new RangeQueryBuilder(this.fild);
        
//        for (){
//
//        }
//        rangeQueryBuilder.gt()
    }
    
    public static class Builder
    {
        private String fild;
        
        private List<Map<String, Range>> range;
        
        private RangBuilder rangBuilder = new RangBuilder();
        
        public Builder setFild(String fild)
        {
            rangBuilder.fild = fild;
            return this;
        }
        
        public Builder setRange(List<Map<String, Range>> range)
        {
            rangBuilder.range = range;
            return this;
        }
    }
    
}
