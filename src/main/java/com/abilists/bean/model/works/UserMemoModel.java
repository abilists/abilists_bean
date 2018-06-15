package com.abilists.bean.model.works;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserMemoModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long umNo;
	private String umTitle;
	private String umMemo;
	private String umBgColor;
	private String umStatus;
	private String umDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public long getUmNo() {
		return umNo;
	}
	public void setUmNo(long umNo) {
		this.umNo = umNo;
	}
	public String getUmTitle() {
		return umTitle;
	}
	public void setUmTitle(String umTitle) {
		this.umTitle = umTitle;
	}
	public String getUmMemo() {
		return umMemo;
	}
	public void setUmMemo(String umMemo) {
		this.umMemo = umMemo;
	}
	public String getUmBgColor() {
		return umBgColor;
	}
	public void setUmBgColor(String umBgColor) {
		this.umBgColor = umBgColor;
	}
	public String getUmStatus() {
		return umStatus;
	}
	public void setUmStatus(String umStatus) {
		this.umStatus = umStatus;
	}
	public String getUmDelete() {
		return umDelete;
	}
	public void setUmDelete(String umDelete) {
		this.umDelete = umDelete;
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
