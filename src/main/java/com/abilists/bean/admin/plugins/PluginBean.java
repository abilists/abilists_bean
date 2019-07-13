package com.abilists.bean.admin.plugins;

import base.bean.BasicBean;

public class PluginBean extends BasicBean {

	public static final String NO = "mpNo";
	public static final String PARTNER_ID = "partnerId";
	public static final String NAME = "mpName";
	public static final String EXPLAIN = "mpExplain";
	public static final String FILE_NAME = "mpFileName";
	public static final String FILE_URL = "mpFileUrl";
	public static final String IMG_NAME = "mpImgName";
	public static final String IMG_URL = "mpImgUrl";
	public static final String VERSION = "mpVersion";
	public static final String CREATED_TIME = "insertTime";
	public static final String UPDATED_TIME = "updateTime";

	// Master Plugin
	private int mpNo;
	private String partnerId;
	private String mpName;
	private String mpExplain;
	private String mpFileName;
	private String mpFileUrl;
	private String mpImgName;
	private String mpImgUrl;
	private String mpVersion;
	private String mpFlagInstall;
	private String mpStatus;
	private String insertTime;
	private String updateTime;

	public int getMpNo() {
		return mpNo;
	}
	public void setMpNo(int mpNo) {
		this.mpNo = mpNo;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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
	public String getMpFileName() {
		return mpFileName;
	}
	public void setMpFileName(String mpFileName) {
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
	public String getMpFlagInstall() {
		return mpFlagInstall;
	}
	public void setMpFlagInstall(String mpFlagInstall) {
		this.mpFlagInstall = mpFlagInstall;
	}
	public String getMpStatus() {
		return mpStatus;
	}
	public void setMpStatus(String mpStatus) {
		this.mpStatus = mpStatus;
	}
	public String getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
