package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMessages<M extends BaseMessages<M>> extends Model<M> implements IBean {

	public M setMessageId(java.lang.Long messageId) {
		set("message_id", messageId);
		return (M)this;
	}

	public java.lang.Long getMessageId() {
		return get("message_id");
	}

	public M setSendUserId(java.lang.Integer sendUserId) {
		set("send_user_id", sendUserId);
		return (M)this;
	}

	public java.lang.Integer getSendUserId() {
		return get("send_user_id");
	}

	public M setSendNickname(java.lang.String sendNickname) {
		set("send_nickname", sendNickname);
		return (M)this;
	}

	public java.lang.String getSendNickname() {
		return get("send_nickname");
	}

	public M setReceiveUserId(java.lang.Integer receiveUserId) {
		set("receive_user_id", receiveUserId);
		return (M)this;
	}

	public java.lang.Integer getReceiveUserId() {
		return get("receive_user_id");
	}

	public M setReceiveNickname(java.lang.String receiveNickname) {
		set("receive_nickname", receiveNickname);
		return (M)this;
	}

	public java.lang.String getReceiveNickname() {
		return get("receive_nickname");
	}

	public M setMessageType(java.lang.Integer messageType) {
		set("message_type", messageType);
		return (M)this;
	}

	public java.lang.Integer getMessageType() {
		return get("message_type");
	}

	public M setMessage(java.lang.String message) {
		set("message", message);
		return (M)this;
	}

	public java.lang.String getMessage() {
		return get("message");
	}

	public M setCreatetime(java.util.Date createtime) {
		set("createtime", createtime);
		return (M)this;
	}

	public java.util.Date getCreatetime() {
		return get("createtime");
	}

	public M setIsDelete(java.lang.Boolean isDelete) {
		set("is_delete", isDelete);
		return (M)this;
	}

	public java.lang.Boolean getIsDelete() {
		return get("is_delete");
	}

}
