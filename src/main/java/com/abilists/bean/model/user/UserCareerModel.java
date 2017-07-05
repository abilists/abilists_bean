package com.abilists.bean.model.user;

import java.io.Serializable;
import java.util.Date;

public class UserCareerModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int ucNo;
	private String ucCompanyName;
	private String ucPresent;
	private String ucStartMonth;
	private String ucStartYear;
	private String ucEndMonth;
	private String ucEndYear;
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
	public String getUcStartMonth() {
		return ucStartMonth;
	}
	public void setUcStartMonth(String ucStartMonth) {
		this.ucStartMonth = ucStartMonth;
	}
	public String getUcStartYear() {
		return ucStartYear;
	}
	public void setUcStartYear(String ucStartYear) {
		this.ucStartYear = ucStartYear;
	}
	public String getUcEndMonth() {
		return ucEndMonth;
	}
	public void setUcEndMonth(String ucEndMonth) {
		this.ucEndMonth = ucEndMonth;
	}
	public String getUcEndYear() {
		return ucEndYear;
	}
	public void setUcEndYear(String ucEndYear) {
		this.ucEndYear = ucEndYear;
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
