package com.abilists.bean.para.plugins;

import org.hibernate.validator.constraints.NotEmpty;

import base.bean.para.CommonPara;

public class DltPluginsPara extends CommonPara {

	@NotEmpty(message = "request.para.name")
	private String mpNo;

	private String mpName;

	private String mpStatus;

	public String getMpNo() {
		return mpNo;
	}

	public void setMpNo(String mpNo) {
		this.mpNo = mpNo;
	}

	public String getMpName() {
		return mpName;
	}

	public void setMpName(String mpName) {
		this.mpName = mpName;
	}

	public String getMpStatus() {
		return mpStatus;
	}

	public void setMpStatus(String mpStatus) {
		this.mpStatus = mpStatus;
	}

}