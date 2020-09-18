package com.abilists.bean.para.admin.plugins;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.UploadFiles;

public class UdtPluginPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	private String mpNo;

	@NotNull(message = "parameter.error.null.message")
	private String serverName;

	private String mpMemuMain;

	@NotNull(message = "parameter.error.null.message")
	private String mpName;

	private String mpMenuName;

	@NotNull(message = "parameter.error.null.message")
	@ByteString(charset = "UTF-8", min = 1, max = 2900, message = "parameter.error.size.max2900.message") // 100
	private String mpExplain;

	@UploadFiles(message = "parameter.error.null.message")
	private MultipartFile mpFileName;

	private String mpImgName;

	private String mpImgUrl;
	
	@NotNull(message = "parameter.error.null.message")
	private String mpVersion;
	
	@NotNull(message = "parameter.error.null.message")
	private String mpStatus;

	@NotNull(message = "parameter.error.null.message")
	private String mpTarget;

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
	public String getMpMemuMain() {
		return mpMemuMain;
	}
	public void setMpMemuMain(String mpMemuMain) {
		this.mpMemuMain = mpMemuMain;
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
