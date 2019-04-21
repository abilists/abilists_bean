package com.abilists.bean.model.user;

import java.io.Serializable;
import java.util.Date;

public class UserOptionsModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long uoNo;
	private String uoOption;
	private String uoValue;
	private String uoStatus;
	private String uoDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public long getUoNo() {
		return uoNo;
	}
	public void setUoNo(long uoNo) {
		this.uoNo = uoNo;
	}
	public String getUoOption() {
		return uoOption;
	}
	public void setUoOption(String uoOption) {
		this.uoOption = uoOption;
	}
	public String getUoValue() {
		return uoValue;
	}
	public void setUoValue(String uoValue) {
		this.uoValue = uoValue;
	}
	public String getUoStatus() {
		return uoStatus;
	}
	public void setUoStatus(String uoStatus) {
		this.uoStatus = uoStatus;
	}
	public String getUoDelete() {
		return uoDelete;
	}
	public void setUoDelete(String uoDelete) {
		this.uoDelete = uoDelete;
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
