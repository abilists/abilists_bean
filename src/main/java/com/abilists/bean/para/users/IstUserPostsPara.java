package com.abilists.bean.para.users;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.StringByte;

public class IstUserPostsPara extends CommonPara {

	private String upsserviceNo;
	private String upsServiceName;
	private String upsTitle;

	@NotNull(message = "upsPost")
	@StringByte(charset = "ms949", min = 1, max = 2500, message = "parameter.error.size.max2500.message")
	private String upsPost;
	private String upsFileName;
	private String upsFilePath;

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

	public String getUpsFileName() {
		return upsFileName;
	}

	public void setUpsFileName(String upsFileName) {
		this.upsFileName = upsFileName;
	}

	public String getUpsFilePath() {
		return upsFilePath;
	}

	public void setUpsFilePath(String upsFilePath) {
		this.upsFilePath = upsFilePath;
	}

	
	
}