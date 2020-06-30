package com.abilists.bean.model.notice;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserNoticeModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long unoNo;
	private String unoTitle;
	private String unoUrl;
	private String unoContents;
	private String unoKind;
	private String unoStatus;
	private String unoDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public long getUnoNo() {
		return unoNo;
	}
	public void setUnoNo(long unoNo) {
		this.unoNo = unoNo;
	}
	public String getUnoTitle() {
		return unoTitle;
	}
	public void setUnoTitle(String unoTitle) {
		this.unoTitle = unoTitle;
	}
	public String getUnoUrl() {
		return unoUrl;
	}
	public void setUnoUrl(String unoUrl) {
		this.unoUrl = unoUrl;
	}
	public String getUnoContents() {
		return unoContents;
	}
	public void setUnoContents(String unoContents) {
		this.unoContents = unoContents;
	}
	public String getUnoKind() {
		return unoKind;
	}
	public void setUnoKind(String unoKind) {
		this.unoKind = unoKind;
	}
	public String getUnoStatus() {
		return unoStatus;
	}
	public void setUnoStatus(String unoStatus) {
		this.unoStatus = unoStatus;
	}
	public String getUnoDelete() {
		return unoDelete;
	}
	public void setUnoDelete(String unoDelete) {
		this.unoDelete = unoDelete;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
