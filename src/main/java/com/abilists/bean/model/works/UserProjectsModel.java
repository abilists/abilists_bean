package com.abilists.bean.model.works;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserProjectsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long upNo;
	private long upSort;
	private String upName;
	private String upProgress;
	private String upExplain;
	private String upMembers;
	private String upCodeIndustry;
	private String upCodeRole;
	private String upTop;
	private String upStatus;
	private String upDelete;
	private String userId;
	private String mrName;
	private Date insertTime;
	private Date updateTime;

	public long getUpNo() {
		return upNo;
	}
	public void setUpNo(long upNo) {
		this.upNo = upNo;
	}
	public long getUpSort() {
		return upSort;
	}
	public void setUpSort(long upSort) {
		this.upSort = upSort;
	}
	public String getUpName() {
		return upName;
	}
	public void setUpName(String upName) {
		this.upName = upName;
	}
	public String getUpProgress() {
		return upProgress;
	}
	public void setUpProgress(String upProgress) {
		this.upProgress = upProgress;
	}
	public String getUpExplain() {
		return upExplain;
	}
	public void setUpExplain(String upExplain) {
		this.upExplain = upExplain;
	}
	public String getUpMembers() {
		return upMembers;
	}
	public void setUpMembers(String upMembers) {
		this.upMembers = upMembers;
	}
	public String getUpCodeIndustry() {
		return upCodeIndustry;
	}
	public void setUpCodeIndustry(String upCodeIndustry) {
		this.upCodeIndustry = upCodeIndustry;
	}
	public String getUpCodeRole() {
		return upCodeRole;
	}
	public void setUpCodeRole(String upCodeRole) {
		this.upCodeRole = upCodeRole;
	}
	public String getUpTop() {
		return upTop;
	}
	public void setUpTop(String upTop) {
		this.upTop = upTop;
	}
	public String getUpStatus() {
		return upStatus;
	}
	public void setUpStatus(String upStatus) {
		this.upStatus = upStatus;
	}
	public String getUpDelete() {
		return upDelete;
	}
	public void setUpDelete(String upDelete) {
		this.upDelete = upDelete;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMrName() {
		return mrName;
	}
	public void setMrName(String mrName) {
		this.mrName = mrName;
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
