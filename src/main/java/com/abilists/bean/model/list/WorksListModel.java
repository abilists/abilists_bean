package com.abilists.bean.model.list;

import java.io.Serializable;

import base.bean.model.BasicModel;

public class WorksListModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;
	private int cntProjects;
	private int cntTasks;
	private int cntMemo;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getCntProjects() {
		return cntProjects;
	}
	public void setCntProjects(int cntProjects) {
		this.cntProjects = cntProjects;
	}
	public int getCntTasks() {
		return cntTasks;
	}
	public void setCntTasks(int cntTasks) {
		this.cntTasks = cntTasks;
	}
	public int getCntMemo() {
		return cntMemo;
	}
	public void setCntMemo(int cntMemo) {
		this.cntMemo = cntMemo;
	}

}
