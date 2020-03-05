package com.abilists.bean.model.works;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserTasksModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long utNo;
	private long utSort;
	private String utTitle;
	private String utTask;
	private String utKind;
	private String utProgress;
	private Date utStartDay;
	private Date utEndDay;
	private int utTaskHour;
	private int utMarginHour;
	private String utStatus;
	private String utDelete;
	private int upNo;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public long getUtNo() {
		return utNo;
	}
	public void setUtNo(long utNo) {
		this.utNo = utNo;
	}
	public long getUtSort() {
		return utSort;
	}
	public void setUtSort(long utSort) {
		this.utSort = utSort;
	}
	public String getUtTitle() {
		return utTitle;
	}
	public void setUtTitle(String utTitle) {
		this.utTitle = utTitle;
	}
	public String getUtTask() {
		return utTask;
	}
	public void setUtTask(String utTask) {
		this.utTask = utTask;
	}
	public String getUtKind() {
		return utKind;
	}
	public void setUtKind(String utKind) {
		this.utKind = utKind;
	}
	public String getUtProgress() {
		return utProgress;
	}
	public void setUtProgress(String utProgress) {
		this.utProgress = utProgress;
	}
	public Date getUtStartDay() {
		return utStartDay;
	}
	public void setUtStartDay(Date utStartDay) {
		this.utStartDay = utStartDay;
	}
	public Date getUtEndDay() {
		return utEndDay;
	}
	public void setUtEndDay(Date utEndDay) {
		this.utEndDay = utEndDay;
	}
	public int getUtTaskHour() {
		return utTaskHour;
	}
	public void setUtTaskHour(int utTaskHour) {
		this.utTaskHour = utTaskHour;
	}
	public int getUtMarginHour() {
		return utMarginHour;
	}
	public void setUtMarginHour(int utMarginHour) {
		this.utMarginHour = utMarginHour;
	}
	public String getUtStatus() {
		return utStatus;
	}
	public void setUtStatus(String utStatus) {
		this.utStatus = utStatus;
	}
	public String getUtDelete() {
		return utDelete;
	}
	public void setUtDelete(String utDelete) {
		this.utDelete = utDelete;
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
