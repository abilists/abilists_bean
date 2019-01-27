package com.abilists.bean.model.user;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserChartModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long uctNo;
	private String uctKind;
	private int uctSort;
	private String uctTitle;
	private String uctStatus;
	private String uctDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public long getUctNo() {
		return uctNo;
	}
	public void setUctNo(long uctNo) {
		this.uctNo = uctNo;
	}
	public String getUctKind() {
		return uctKind;
	}
	public void setUctKind(String uctKind) {
		this.uctKind = uctKind;
	}
	public int getUctSort() {
		return uctSort;
	}
	public void setUctSort(int uctSort) {
		this.uctSort = uctSort;
	}
	public String getUctTitle() {
		return uctTitle;
	}
	public void setUctTitle(String uctTitle) {
		this.uctTitle = uctTitle;
	}
	public String getUctStatus() {
		return uctStatus;
	}
	public void setUctStatus(String uctStatus) {
		this.uctStatus = uctStatus;
	}
	public String getUctDelete() {
		return uctDelete;
	}
	public void setUctDelete(String uctDelete) {
		this.uctDelete = uctDelete;
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
