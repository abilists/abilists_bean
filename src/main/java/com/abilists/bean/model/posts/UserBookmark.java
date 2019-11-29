package com.abilists.bean.model.posts;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserBookmark extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long ubNo;
	private String ubServiceName;
	private String ubStatus;
	private String ubDelete;
	private long ups_no;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public long getUbNo() {
		return ubNo;
	}
	public void setUbNo(long ubNo) {
		this.ubNo = ubNo;
	}
	public String getUbServiceName() {
		return ubServiceName;
	}
	public void setUbServiceName(String ubServiceName) {
		this.ubServiceName = ubServiceName;
	}
	public String getUbStatus() {
		return ubStatus;
	}
	public void setUbStatus(String ubStatus) {
		this.ubStatus = ubStatus;
	}
	public String getUbDelete() {
		return ubDelete;
	}
	public void setUbDelete(String ubDelete) {
		this.ubDelete = ubDelete;
	}
	public long getUps_no() {
		return ups_no;
	}
	public void setUps_no(long ups_no) {
		this.ups_no = ups_no;
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
