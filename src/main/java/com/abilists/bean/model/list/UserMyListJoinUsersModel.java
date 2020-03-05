package com.abilists.bean.model.list;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserMyListJoinUsersModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long umlNo;
	private String umlUserId;
	private String umlStatus;
	private String umlDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;
	private int sumUsLevel;
	private String userName;
	private String userProfile;

	public long getUmlNo() {
		return umlNo;
	}
	public void setUmlNo(long umlNo) {
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
	public int getSumUsLevel() {
		return sumUsLevel;
	}
	public void setSumUsLevel(int sumUsLevel) {
		this.sumUsLevel = sumUsLevel;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
}
