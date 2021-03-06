package com.abilists.bean.model.works;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserProjectTechModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long uptNo;
	private String uptKind;
	private int uptLevel;
	private String uptDetail;
	private String uptStatus;
	private String uptDelete;
	private Date insertTime;
	private Date updateTime;
	private int msNo;
	private int upNo;
	private String userId;

	public long getUptNo() {
		return uptNo;
	}
	public void setUptNo(long uptNo) {
		this.uptNo = uptNo;
	}
	public String getUptKind() {
		return uptKind;
	}
	public void setUptKind(String uptKind) {
		this.uptKind = uptKind;
	}
	public int getUptLevel() {
		return uptLevel;
	}
	public void setUptLevel(int uptLevel) {
		this.uptLevel = uptLevel;
	}
	public String getUptDetail() {
		return uptDetail;
	}
	public void setUptDetail(String uptDetail) {
		this.uptDetail = uptDetail;
	}
	public String getUptStatus() {
		return uptStatus;
	}
	public void setUptStatus(String uptStatus) {
		this.uptStatus = uptStatus;
	}
	public String getUptDelete() {
		return uptDelete;
	}
	public void setUptDelete(String uptDelete) {
		this.uptDelete = uptDelete;
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
	public int getMsNo() {
		return msNo;
	}
	public void setMsNo(int msNo) {
		this.msNo = msNo;
	}
	public int getUpNo() {
		return upNo;
	}
	public void setUpNo(int upNo) {
		this.upNo = upNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}


}
