package com.abilists.bean.para.posts;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class IstBookmarkPara extends CommonPara {

	private String ubServiceName;
	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String upsNo;

	private String ubStatus;

	public String getUbServiceName() {
		return ubServiceName;
	}
	public void setUbServiceName(String ubServiceName) {
		this.ubServiceName = ubServiceName;
	}
	public String getUpsNo() {
		return upsNo;
	}
	public void setUpsNo(String upsNo) {
		this.upsNo = upsNo;
	}
	public String getUbStatus() {
		return ubStatus;
	}
	public void setUbStatus(String ubStatus) {
		this.ubStatus = ubStatus;
	}

}
