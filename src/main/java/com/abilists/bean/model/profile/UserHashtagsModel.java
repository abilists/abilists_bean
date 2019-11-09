package com.abilists.bean.model.profile;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserHashtagsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long uhNo;
	private String uhTags;
	private String uhStatus;
	private String uhDelete;
	private String userId;
	private long msNo;
	private String msKind;
	private Date insertTime;
	private Date updateTime;

	public long getUhNo() {
		return uhNo;
	}
	public void setUhNo(long uhNo) {
		this.uhNo = uhNo;
	}
	public String getUhTags() {
		return uhTags;
	}
	public void setUhTags(String uhTags) {
		this.uhTags = uhTags;
	}
	public String getUhStatus() {
		return uhStatus;
	}
	public void setUhStatus(String uhStatus) {
		this.uhStatus = uhStatus;
	}
	public String getUhDelete() {
		return uhDelete;
	}
	public void setUhDelete(String uhDelete) {
		this.uhDelete = uhDelete;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getMsNo() {
		return msNo;
	}
	public void setMsNo(long msNo) {
		this.msNo = msNo;
	}
	public String getMsKind() {
		return msKind;
	}
	public void setMsKind(String msKind) {
		this.msKind = msKind;
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
