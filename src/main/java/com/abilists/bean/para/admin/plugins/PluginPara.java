package com.abilists.bean.para.admin.plugins;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import base.bean.para.CommonPara;

public class PluginPara extends CommonPara {

	private String no;
	
	@NotNull(message = "parameter.error.null.message")
	private String mpNo;
	
	private String mpMemuMain;

	@NotNull(message = "parameter.error.null.message")
	private String mpName;

	private String mpMenuName;

	private String mpFileName;
	
	private String mpVersion;
	
	private String mpExplain;

	private String mpImgName;
	
	private String mpStatus;

	private String forceOption;

	private MultipartFile mpFile;

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
	public String getMpFileName() {
		return mpFileName;
	}
	public void setMpFileName(String mpFileName) {
		this.mpFileName = mpFileName;
	}
	public String getMpVersion() {
		return mpVersion;
	}
	public void setMpVersion(String mpVersion) {
		this.mpVersion = mpVersion;
	}
	public String getMpExplain() {
		return mpExplain;
	}
	public void setMpExplain(String mpExplain) {
		this.mpExplain = mpExplain;
	}
	public String getMpImgName() {
		return mpImgName;
	}
	public void setMpImgName(String mpImgName) {
		this.mpImgName = mpImgName;
	}
	public String getMpStatus() {
		return mpStatus;
	}
	public void setMpStatus(String mpStatus) {
		this.mpStatus = mpStatus;
	}
	public String getForceOption() {
		return forceOption;
	}
	public void setForceOption(String forceOption) {
		this.forceOption = forceOption;
	}
	public MultipartFile getMpFile() {
		return mpFile;
	}
	public void setMpFile(MultipartFile mpFile) {
		this.mpFile = mpFile;
	}

}
