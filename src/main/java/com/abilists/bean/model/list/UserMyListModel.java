package com.abilists.bean.model.list;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserMyListModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int umlNo;
	private String umlUserId;
	private String umlStatus;
	private String umlDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public int getUmlNo() {
		return umlNo;
	}
	public void setUmlNo(int umlNo) {
		this.umlNo = umlNo;
	}
	public String getUmlUserId() {
		return umlUserId;
	}
	public void setUmlUserId(String umlUserId) {
		this.umlUserId = umlUserId;
	}
	public String getUmlStatus() {
		return umlStatus;
	}
	public void setUmlStatus(String umlStatus) {
		this.umlStatus = umlStatus;
	}
	public String getUmlDelete() {
		return umlDelete;
	}
	public void setUmlDelete(String umlDelete) {
		this.umlDelete = umlDelete;
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
