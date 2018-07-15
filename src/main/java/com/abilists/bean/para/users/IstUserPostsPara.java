package com.abilists.bean.para.users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class IstUserPostsPara extends CommonPara {

	private String upsserviceNo;
	private String upsServiceName;
	private String upsTitle;

	@NotNull(message = "upsPost")
	@Size(min = 1, max = 2500, message = "parameter.error.size.max2500.message")
	private String upsPost;

	public String getUpsserviceNo() {
		return upsserviceNo;
	}

	public void setUpsserviceNo(String upsserviceNo) {
		this.upsserviceNo = upsserviceNo;
	}

	public String getUpsServiceName() {
		return upsServiceName;
	}

	public void setUpsServiceName(String upsServiceName) {
		this.upsServiceName = upsServiceName;
	}

	public String getUpsTitle() {
		return upsTitle;
	}

	public void setUpsTitle(String upsTitle) {
		this.upsTitle = upsTitle;
	}

	public String getUpsPost() {
		return upsPost;
	}

	public void setUpsPost(String upsPost) {
		this.upsPost = upsPost;
	}

	
	
}