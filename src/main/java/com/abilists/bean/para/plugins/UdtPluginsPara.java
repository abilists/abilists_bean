package com.abilists.bean.para.plugins;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.UploadFiles;

public class UdtPluginsPara extends CommonPara {

	@NotEmpty(message = "request.para.name")
	private String mpNo;

	private String mpName;

	private String mpExplain;

	@UploadFiles(message = "parameter.error.null.message")
	private MultipartFile mpFileName;

	private String mpFileUrl;

	private String mpImgName;

	private String mpImgUrl;

	@NotEmpty(message = "request.para.name")
	private String mpVersion;

	private String mpStatus;

	private String mpTarget;

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

	public String getMpExplain() {
		return mpExplain;
	}

	public void setMpExplain(String mpExplain) {
		this.mpExplain = mpExplain;
	}

	public MultipartFile getMpFileName() {
		return mpFileName;
	}

	public void setMpFileName(MultipartFile mpFileName) {
		this.mpFileName = mpFileName;
	}

	public String getMpFileUrl() {
		return mpFileUrl;
	}

	public void setMpFileUrl(String mpFileUrl) {
		this.mpFileUrl = mpFileUrl;
	}

	public String getMpImgName() {
		return mpImgName;
	}

	public void setMpImgName(String mpImgName) {
		this.mpImgName = mpImgName;
	}

	public String getMpImgUrl() {
		return mpImgUrl;
	}

	public void setMpImgUrl(String mpImgUrl) {
		this.mpImgUrl = mpImgUrl;
	}

	public String getMpVersion() {
		return mpVersion;
	}

	public void setMpVersion(String mpVersion) {
		this.mpVersion = mpVersion;
	}

	public String getMpStatus() {
		return mpStatus;
	}

	public void setMpStatus(String mpStatus) {
		this.mpStatus = mpStatus;
	}

	public String getMpTarget() {
		return mpTarget;
	}

	public void setMpTarget(String mpTarget) {
		this.mpTarget = mpTarget;
	}

}