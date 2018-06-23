package com.abilists.bean;

import java.util.HashMap;
import java.util.List;

import com.abilists.bean.admin.SkillsLevelBean;
import com.abilists.bean.admin.ReportsBean;
import com.abilists.bean.model.admin.sum.AdminUserReportsSumModel;
import com.abilists.bean.model.sum.AdminUsersSumByYearModel;
import com.abilists.bean.model.sum.UserProjectsSumByYearModel;
import com.abilists.bean.model.works.UserReportsModel;

import base.bean.model.CommonModel;

public class AdminAbilistsModel extends CommonModel {

	private List<AdminUsersSumByYearModel> adminUsersSumByYearList;
	private List<UserProjectsSumByYearModel> userProjectsSumByYearList;

	private List<ReportsBean> taskBeanList;
	private List<UserReportsModel> userReportsList;
	private HashMap<String, List<AdminUserReportsSumModel>> adminUserTaskSumMap;

	// Sum Techs
	private int techsSum;
	// Sum Industry
	private int industrySum;
	// Sum Roles
	private int rolesSum;
	// Notification
	private int notiSum;
	// Sum Group user skill level
	private SkillsLevelBean skillsLevelBean;

	public List<AdminUsersSumByYearModel> getAdminUsersSumByYearList() {
		return adminUsersSumByYearList;
	}

	public void setAdminUsersSumByYearList(List<AdminUsersSumByYearModel> adminUsersSumByYearList) {
		this.adminUsersSumByYearList = adminUsersSumByYearList;
	}

	public List<UserProjectsSumByYearModel> getUserProjectsSumByYearList() {
		return userProjectsSumByYearList;
	}

	public void setUserProjectsSumByYearList(List<UserProjectsSumByYearModel> userProjectsSumByYearList) {
		this.userProjectsSumByYearList = userProjectsSumByYearList;
	}

	public List<ReportsBean> getTaskBeanList() {
		return taskBeanList;
	}

	public void setTaskBeanList(List<ReportsBean> taskBeanList) {
		this.taskBeanList = taskBeanList;
	}

	public List<UserReportsModel> getUserReportsList() {
		return userReportsList;
	}

	public void setUserReportsList(List<UserReportsModel> userReportsList) {
		this.userReportsList = userReportsList;
	}

	public HashMap<String, List<AdminUserReportsSumModel>> getAdminUserTaskSumMap() {
		return adminUserTaskSumMap;
	}

	public void setAdminUserTaskSumMap(HashMap<String, List<AdminUserReportsSumModel>> adminUserTaskSumMap) {
		this.adminUserTaskSumMap = adminUserTaskSumMap;
	}

	public int getTechsSum() {
		return techsSum;
	}

	public void setTechsSum(int techsSum) {
		this.techsSum = techsSum;
	}

	public int getIndustrySum() {
		return industrySum;
	}

	public void setIndustrySum(int industrySum) {
		this.industrySum = industrySum;
	}

	public int getRolesSum() {
		return rolesSum;
	}

	public void setRolesSum(int rolesSum) {
		this.rolesSum = rolesSum;
	}

	public int getNotiSum() {
		return notiSum;
	}

	public void setNotiSum(int notiSum) {
		this.notiSum = notiSum;
	}

	public SkillsLevelBean getSkillsLevelBean() {
		return skillsLevelBean;
	}

	public void setSkillsLevelBean(SkillsLevelBean skillsLevelBean) {
		this.skillsLevelBean = skillsLevelBean;
	}

}