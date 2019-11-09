package com.abilists.bean.para.profile;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;

public class IstUserHashtagsPara extends CommonPara {

	// uhTags is msName
	private String uhTags;
	private String uhStatus;

	@NotNull(message = "parameter.error.null.message")
	private String msNo;
	@NotNull(message = "parameter.error.null.message")
	private String msKind;

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