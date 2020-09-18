package com.abilists.bean.para.admin.plugins;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;

public class DltPluginPara extends CommonPara {

	private String no;
	
	@NotNull(message = "parameter.error.null.message")
	private String mpNo;

	@NotNull(message = "parameter.error.null.message")
	private String serverName;

	private String mpName;

	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMpNo() {
		return mpNo;
	}
	public void setMpNo(String mpNo) {
		this.mpNo = mpNo;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getMpName() {
		return mpName;
	}
	public void setMpName(String mpName) {
		this.mpName = mpName;
	}

}
