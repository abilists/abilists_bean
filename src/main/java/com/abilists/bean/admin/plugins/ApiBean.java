package com.abilists.bean.admin.plugins;

public class ApiBean {

	private String partnerId;
	private String partnerIdEncoded;
	private MessageBean messageBean;

	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerIdEncoded() {
		return partnerIdEncoded;
	}
	public void setPartnerIdEncoded(String partnerIdEncoded) {
		this.partnerIdEncoded = partnerIdEncoded;
	}
	public MessageBean getMessageBean() {
		return messageBean;
	}
	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}

}