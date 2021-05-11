package com.abilists.bean.model.works;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserReportsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long urNo;
	private Date urWorkDay;
	private String urWorkHour;
	private String urReport;
	private String urStatus;
	private String urDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public long getUrNo() {
		return urNo;
	}
	public void setUrNo(long urNo) {
		this.urNo = urNo;
	}
	public Date getUrWorkDay() {
		return urWorkDay;
	}
	public void setUrWorkDay(Date urWorkDay) {
		this.urWorkDay = urWorkDay;
	}
	public String getUrWorkHour() {
		return urWorkHour;
	}
	public void setUrWorkHour(String urWorkHour) {
		this.urWorkHour = urWorkHour;
	}
	public String getUrReport() {
		return urReport;
	}
	public void setUrReport(String urReport) {
		this.urReport = urReport;
	}
	public String getUrStatus() {
		return urStatus;
	}
	public void setUrStatus(String urStatus) {
		this.urStatus = urStatus;
	}
	public String getUrDelete() {
		return urDelete;
	}
	public void setUrDelete(String urDelete) {
		this.urDelete = urDelete;
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
