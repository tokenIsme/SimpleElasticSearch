package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseProductShippingPolicy<M extends BaseProductShippingPolicy<M>> extends Model<M> implements IBean {

	public M setPolicyId(java.lang.Integer policyId) {
		set("policy_id", policyId);
		return (M)this;
	}

	public java.lang.Integer getPolicyId() {
		return get("policy_id");
	}

	public M setProductId(java.lang.Integer productId) {
		set("product_id", productId);
		return (M)this;
	}

	public java.lang.Integer getProductId() {
		return get("product_id");
	}

	public M setTemplateId(java.lang.Integer templateId) {
		set("template_id", templateId);
		return (M)this;
	}

	public java.lang.Integer getTemplateId() {
		return get("template_id");
	}

}
