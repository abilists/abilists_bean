package com.abilists.bean.model.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.abilists.bean.model.BasicModel;

public class UserProjectsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int upNo;
	private String upName;
	private String upIndustrial;
	private String upExplain;
	private String upMembers;
	private String upRole;
	private String upStatus;
	private String upDelete;
	private String userId;
	private String mrName;
	private Date insertTime;
	private Date updateTime;

	private List<UserTaskModel> userTaskList;

	public int getUpNo() {
		return upNo;
	}
	public void setUpNo(int upNo) {
		this.upNo = upNo;
	}
	public String getUpName() {
		return upName;
	}
	public void setUpName(String upName) {
		this.upName = upName;
	}
	public String getUpIndustrial() {
		return upIndustrial;
	}
	public void setUpIndustrial(String upIndustrial) {
		this.upIndustrial = upIndustrial;
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
	public String getUpRole() {
		return upRole;
	}
	public void setUpRole(String upRole) {
		this.upRole = upRole;
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
	public List<UserTaskModel> getUserTaskList() {
		return userTaskList;
	}
	public void setUserTaskList(List<UserTaskModel> userTaskList) {
		this.userTaskList = userTaskList;
	}

}
