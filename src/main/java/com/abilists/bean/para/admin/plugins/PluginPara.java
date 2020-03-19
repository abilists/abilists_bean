package com.abilists.bean.para.admin.plugins;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;

public class PluginPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	private String mpNo;
	
	private String mpMemuMain;

	@NotNull(message = "parameter.error.null.message")
	private String mpName;

	private String mpMenuName;

	private String mpFileName;
	
	private String mpVersion;
	
	private String mpExplain;

	private String forceOption;

	public String getMpNo() {
		return mpNo;
	}
	public void setMpNo(String mpNo) {
		this.mpNo = mpNo;
	}
	public String getMpMemuMain() {
		return mpMemuMain;
	}
	public void setMpMemuMain(String mpMemuMain) {
		this.mpMemuMain = mpMemuMain;
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
	public String getMpVersion() {
		return mpVersion;
	}
	public void setMpVersion(String mpVersion) {
		this.mpVersion = mpVersion;
	}
	public String getMpExplain() {
		return mpExplain;
	}
	public void setMpExplain(String mpExplain) {
		this.mpExplain = mpExplain;
	}
	public String getForceOption() {
		return forceOption;
	}
	public void setForceOption(String forceOption) {
		this.forceOption = forceOption;
	}

}
