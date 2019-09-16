package com.abilists.bean.admin.plugins;

import java.util.List;

public class ApiPluginBean {

	private String partnerId;
	private PartnerBean partnerBean;
	private List<PluginBean> pluginBeanList;

	private MessageBean messageBean;

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public PartnerBean getPartnerBean() {
		return partnerBean;
	}

	public void setPartnerBean(PartnerBean partnerBean) {
		this.partnerBean = partnerBean;
	}

	public List<PluginBean> getPluginBeanList() {
		return pluginBeanList;
	}

	public void setPluginBeanList(List<PluginBean> pluginBeanList) {
		this.pluginBeanList = pluginBeanList;
	}

	public MessageBean getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}


}