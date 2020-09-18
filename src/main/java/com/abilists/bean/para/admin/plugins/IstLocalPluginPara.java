package com.abilists.bean.para.admin.plugins;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.UploadFiles;

public class IstLocalPluginPara extends CommonPara {


	@NotNull(message = "parameter.error.null.message")
	private String serverName;

	private String mpNo;

	@NotNull(message = "parameter.error.null.message")
	private String mpName;

	private String mpMenuName;

	@UploadFiles(message = "parameter.error.null.message")
	private MultipartFile mpFileName;
	
	private String mpImgName;

	private String mpVersion;

	private String mpStatus;
	
	private String mpExplain;

	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
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
	public String getMpMenuName() {
		return mpMenuName;
	}
	public void setMpMenuName(String mpMenuName) {
		this.mpMenuName = mpMenuName;
	}
	public MultipartFile getMpFileName() {
		return mpFileName;
	}
	public void setMpFileName(MultipartFile mpFileName) {
		this.mpFileName = mpFileName;
	}
	public String getMpImgName() {
		return mpImgName;
	}
	public void setMpImgName(String mpImgName) {
		this.mpImgName = mpImgName;
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
	public String getMpExplain() {
		return mpExplain;
	}
	public void setMpExplain(String mpExplain) {
		this.mpExplain = mpExplain;
	}

}
