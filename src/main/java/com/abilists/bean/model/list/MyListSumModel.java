package com.abilists.bean.model.list;

import java.io.Serializable;

import base.bean.model.BasicModel;

public class MyListSumModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cntSkills;
	private int cntCareer;
	private int cntProjects;
	private int cntTasks;
	private int cntReports;
	private int cntMemo;
	private int cntMyList;

	public int getCntSkills() {
		return cntSkills;
	}
	public void setCntSkills(int cntSkills) {
		this.cntSkills = cntSkills;
	}
	public int getCntCareer() {
		return cntCareer;
	}
	public void setCntCareer(int cntCareer) {
		this.cntCareer = cntCareer;
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
	public int getCntReports() {
		return cntReports;
	}
	public void setCntReports(int cntReports) {
		this.cntReports = cntReports;
	}
	public int getCntMemo() {
		return cntMemo;
	}
	public void setCntMemo(int cntMemo) {
		this.cntMemo = cntMemo;
	}
	public int getCntMyList() {
		return cntMyList;
	}
	public void setCntMyList(int cntMyList) {
		this.cntMyList = cntMyList;
	}
	
	
}
