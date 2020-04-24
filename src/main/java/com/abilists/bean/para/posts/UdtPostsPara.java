package com.abilists.bean.para.posts;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;


public class UdtPostsPara extends CommonPara {

	private String upsNo;
	private String upsserviceNo;
	private String upsServiceName;
	private String upsTitle;

	@NotNull(message = "upsPost")
	@ByteString(charset = "UTF-8", min = 1, max = 4900, message = "parameter.error.size.max4900.message") // 5000
	private String upsPost;
	private String upsFileName;
	private String upsFilePath;
	private String upsStatus;

	public String getUpsNo() {
		return upsNo;
	}

	public void setUpsNo(String upsNo) {
		this.upsNo = upsNo;
	}

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

	public String getUpsStatus() {
		return upsStatus;
	}

	public void setUpsStatus(String upsStatus) {
		this.upsStatus = upsStatus;
	}

}
