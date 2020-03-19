package com.abilists.bean.para.admin.plugins;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;

public class DltLocalPluginPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	private String mpNo;

	@NotNull(message = "parameter.error.null.message")
	private String mpName;

	private String mpVersion;

	private String mpFileName;

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
	public String getMpVersion() {
		return mpVersion;
	}
	public void setMpVersion(String mpVersion) {
		this.mpVersion = mpVersion;
	}
	public String getMpFileName() {
		return mpFileName;
	}
	public void setMpFileName(String mpFileName) {
		this.mpFileName = mpFileName;
	}

}
