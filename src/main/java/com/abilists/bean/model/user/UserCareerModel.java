package com.abilists.bean.model.user;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserCareerModel extends BasicModel implements Serializable {

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
	private String ucCodeIndustry;
	private String ucCodeRole;
	private String ucStatus;
	private String ucDelete;
	private String userId;
	private int mrNo;
	private int miNo;
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
	public String getUcCodeIndustry() {
		return ucCodeIndustry;
	}
	public void setUcCodeIndustry(String ucCodeIndustry) {
		this.ucCodeIndustry = ucCodeIndustry;
	}
	public String getUcCodeRole() {
		return ucCodeRole;
	}
	public void setUcCodeRole(String ucCodeRole) {
		this.ucCodeRole = ucCodeRole;
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
	public int getMrNo() {
		return mrNo;
	}
	public void setMrNo(int mrNo) {
		this.mrNo = mrNo;
	}
	public int getMiNo() {
		return miNo;
	}
	public void setMiNo(int miNo) {
		this.miNo = miNo;
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
