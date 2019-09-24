package com.abilists.bean.para.admin.plugins;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;

public class DltPluginPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	private String mpNo;

	@NotNull(message = "parameter.error.null.message")
	private String partnerId;

	private String mpName;

	public String getMpNo() {
		return mpNo;
	}
	public void setMpNo(String mpNo) {
		this.mpNo = mpNo;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getMpName() {
		return mpName;
	}
	public void setMpName(String mpName) {
		this.mpName = mpName;
	}

}
