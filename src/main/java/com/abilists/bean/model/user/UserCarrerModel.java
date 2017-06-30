package com.abilists.bean.model.user;

import java.io.Serializable;
import java.util.Date;

public class UserCarrerModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int ucNo;
	private String ucCompanyName;
	private String ucPresent;
	private Date ucStartDate;
	private Date ucEndDate;
	private String ucTitle;
	private String ucContents;
	private String ucImg;
	private String ucStatus;
	private String ucDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public int getUcNo() {
		return ucNo;
	}
	public void setUcNo(int ucNo) {
		this.ucNo = ucNo;
	}
	public String getUcCompanyName() {
		return ucCompanyName;
	}
	public void setUcCompanyName(String ucCompanyName) {
		this.ucCompanyName = ucCompanyName;
	}
	public String getUcPresent() {
		return ucPresent;
	}
	public void setUcPresent(String ucPresent) {
		this.ucPresent = ucPresent;
	}
	public Date getUcStartDate() {
		return ucStartDate;
	}
	public void setUcStartDate(Date ucStartDate) {
		this.ucStartDate = ucStartDate;
	}
	public Date getUcEndDate() {
		return ucEndDate;
	}
	public void setUcEndDate(Date ucEndDate) {
		this.ucEndDate = ucEndDate;
	}
	public String getUcTitle() {
		return ucTitle;
	}
	public void setUcTitle(String ucTitle) {
		this.ucTitle = ucTitle;
	}
	public String getUcContents() {
		return ucContents;
	}
	public void setUcContents(String ucContents) {
		this.ucContents = ucContents;
	}
	public String getUcImg() {
		return ucImg;
	}
	public void setUcImg(String ucImg) {
		this.ucImg = ucImg;
	}
	public String getUcStatus() {
		return ucStatus;
	}
	public void setUcStatus(String ucStatus) {
		this.ucStatus = ucStatus;
	}
	public String getUcDelete() {
		return ucDelete;
	}
	public void setUcDelete(String ucDelete) {
		this.ucDelete = ucDelete;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
