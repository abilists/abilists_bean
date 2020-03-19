package com.abilists.bean.para.admin.plugins;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;

public class UdtLocalPluginPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	private String mpNo;

	@NotNull(message = "parameter.error.null.message")
	private String mpName;

	private String mpMenuName;

	private String mpFileName;
	
	private String mpStatus;
	
	private String mpExplain;

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
	public String getMpMenuName() {
		return mpMenuName;
	}
	public void setMpMenuName(String mpMenuName) {
		this.mpMenuName = mpMenuName;
	}
	public String getMpFileName() {
		return mpFileName;
	}
	public void setMpFileName(String mpFileName) {
		this.mpFileName = mpFileName;
	}
	public String getMpStatus() {
		return mpStatus;
	}
	public void setMpStatus(String mpStatus) {
		this.mpStatus = mpStatus;
	}
	public String getMpExplain() {
		return mpExplain;
	}
	public void setMpExplain(String mpExplain) {
		this.mpExplain = mpExplain;
	}

}
