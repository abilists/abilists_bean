package com.abilists.bean.para.profile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class UdtUserHashtagsPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String uhNo;
	
	// uhTags is msName
	private String uhTags;
	private String uhStatus;

	@NotNull(message = "parameter.error.null.message")
	private String msNo;
	@NotNull(message = "parameter.error.null.message")
	private String msKind;
	public String getUhNo() {
		return uhNo;
	}
	public void setUhNo(String uhNo) {
		this.uhNo = uhNo;
	}
	public String getUhTags() {
		return uhTags;
	}
	public void setUhTags(String uhTags) {
		this.uhTags = uhTags;
	}
	public String getUhStatus() {
		return uhStatus;
	}
	public void setUhStatus(String uhStatus) {
		this.uhStatus = uhStatus;
	}
	public String getMsNo() {
		return msNo;
	}
	public void setMsNo(String msNo) {
		this.msNo = msNo;
	}
	public String getMsKind() {
		return msKind;
	}
	public void setMsKind(String msKind) {
		this.msKind = msKind;
	}

}