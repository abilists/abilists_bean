package com.abilists.bean.model.admin.plugins;

import java.util.Date;

import base.bean.BasicBean;

public class MPluginsModel extends BasicBean {

	private long no;
	private long mpNo;
	private String serverName;
	private String mpMemuMain;
	private String mpName;
	private String mpMenuName;
	private String mpExplain;
	private String mpFileName;
	private String mpFileUrl;
	private String mpImgName;
	private String mpImgUrl;
	private String mpVersion;
	private String mpFlagInstall;
	private String mpStatus;
	private Date insertTime;
	private Date updateTime;

	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public long getMpNo() {
		return mpNo;
	}
	public void setMpNo(long mpNo) {
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
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
