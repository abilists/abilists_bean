package com.abilists.bean;

import java.util.List;

import com.abilists.bean.model.NotificationModel;
import com.abilists.bean.model.join.MIndustryJoinUserCareerModel;
import com.abilists.bean.model.join.MTechJoinUserSkillsModel;
import com.abilists.bean.model.join.UserProjectsJoinMindustryModel;
import com.abilists.bean.model.join.UserProjectsJoinMroleModel;
import com.abilists.bean.model.join.UserProjectsJoinTechModel;
import com.abilists.bean.model.join.UserProjectsTechJoinTechModel;
import com.abilists.bean.model.master.MIndustryModel;
import com.abilists.bean.model.master.MRoleModel;
import com.abilists.bean.model.master.MTechDetailModel;
import com.abilists.bean.model.master.MTechModel;
import com.abilists.bean.model.sum.UserProjectsSumByYearModel;
import com.abilists.bean.model.sum.UserSkillsSumBySkillModel;
import com.abilists.bean.model.user.UserCareerModel;
import com.abilists.bean.model.user.UserSkillsModel;
import com.abilists.bean.model.user.UserTemp;
import com.abilists.bean.model.user.UsersModel;
import com.abilists.bean.model.works.UserMemoModel;
import com.abilists.bean.model.works.UserProjectTechModel;
import com.abilists.bean.model.works.UserProjectsModel;
import com.abilists.bean.model.works.UserTaskModel;
import com.abilists.bean.para.admin.SltMIndustryPara;
import com.abilists.bean.para.admin.SltMRolePara;
import com.abilists.bean.para.admin.SltMTechDetailPara;
import com.abilists.bean.para.admin.SltMTechPara;
import com.abilists.bean.user.UserCareerChartBean;
import com.abilists.bean.user.UserCareerRoleSumBean;
import com.abilists.bean.user.UserSkillsSumBean;
import com.abilists.bean.user.UserSkillsSumByKindBean;

import base.bean.model.CommonModel;

public class AbilistsModel extends CommonModel {

	private UserTemp userTemp;
	private UsersModel users;
	private List<UsersModel> usersList;
	private UserSkillsModel userSkills;
	private List<UserSkillsModel> userSkillsList;
	private List<UserSkillsSumBean> userSkillsSumBeanList;
	private List<UserSkillsSumBySkillModel> userSkillsSumBySkillList;

	private UserProjectsModel userProjects;
	private List<UserProjectsModel> userProjectsList;
	private List<UserTaskModel> userTaskList;
	private UserTaskModel userTask;
	private List<UserMemoModel> userMemoList;

	private List<UserProjectsSumByYearModel> userProjectsSumByYearList;
	private List<UserSkillsSumByKindBean> userSkillsSumByKindBeanList;

	private UserProjectTechModel userProjectTech;
	private List<UserProjectTechModel> userProjectTechList;
	private MTechModel mTech;
	private List<MTechModel> mTechList;
	private SltMTechPara sltMTechPara;

	private List<MTechDetailModel> mTechDetailList;
	private SltMTechDetailPara sltMTechDetailPara;

	private List<MRoleModel> mRoleList;
	private SltMRolePara sltMRolePara;

	private List<MIndustryModel> mIndustryList;
	private SltMIndustryPara sltMIndustryPara;

	private NotificationModel notification;
	private List<NotificationModel> notificationList;

	private List<MTechJoinUserSkillsModel> mTechJoinUserSkillsList;
	private List<UserProjectsJoinMroleModel> userProjectsJoinMroleList;
	private List<UserProjectsJoinMindustryModel> userProjectsJoinMindustryList;
	private List<MIndustryJoinUserCareerModel> mIndustryJoinUserCareerList;
	private List<UserCareerRoleSumBean> userCareerRoleSumBeanList;
	private List<UserProjectsJoinTechModel> userProjectsJoinTechList;
	private List<UserProjectsTechJoinTechModel> userProjectsTechJoinTechList;

	private UserCareerModel userCareer;
	private List<UserCareerModel> userCareerList;
	private List<UserCareerChartBean> userCareerChartBeanList;

	public UserTemp getUserTemp() {
		return userTemp;
	}

	public void setUserTemp(UserTemp userTemp) {
		this.userTemp = userTemp;
	}

	public UsersModel getUsers() {
		return users;
	}

	public void setUsers(UsersModel users) {
		this.users = users;
	}

	public List<UsersModel> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<UsersModel> usersList) {
		this.usersList = usersList;
	}

	public UserSkillsModel getUserSkills() {
		return userSkills;
	}

	public void setUserSkills(UserSkillsModel userSkills) {
		this.userSkills = userSkills;
	}

	public List<UserSkillsModel> getUserSkillsList() {
		return userSkillsList;
	}

	public void setUserSkillsList(List<UserSkillsModel> userSkillsList) {
		this.userSkillsList = userSkillsList;
	}

	public List<UserSkillsSumBean> getUserSkillsSumBeanList() {
		return userSkillsSumBeanList;
	}

	public void setUserSkillsSumBeanList(List<UserSkillsSumBean> userSkillsSumBeanList) {
		this.userSkillsSumBeanList = userSkillsSumBeanList;
	}

	public List<UserSkillsSumBySkillModel> getUserSkillsSumBySkillList() {
		return userSkillsSumBySkillList;
	}

	public void setUserSkillsSumBySkillList(List<UserSkillsSumBySkillModel> userSkillsSumBySkillList) {
		this.userSkillsSumBySkillList = userSkillsSumBySkillList;
	}

	public UserProjectsModel getUserProjects() {
		return userProjects;
	}

	public void setUserProjects(UserProjectsModel userProjects) {
		this.userProjects = userProjects;
	}

	public List<UserProjectsModel> getUserProjectsList() {
		return userProjectsList;
	}

	public List<UserTaskModel> getUserTaskList() {
		return userTaskList;
	}

	public void setUserTaskList(List<UserTaskModel> userTaskList) {
		this.userTaskList = userTaskList;
	}

	public UserTaskModel getUserTask() {
		return userTask;
	}

	public void setUserTask(UserTaskModel userTask) {
		this.userTask = userTask;
	}

	public List<UserMemoModel> getUserMemoList() {
		return userMemoList;
	}

	public void setUserMemoList(List<UserMemoModel> userMemoList) {
		this.userMemoList = userMemoList;
	}

	public void setUserProjectsList(List<UserProjectsModel> userProjectsList) {
		this.userProjectsList = userProjectsList;
	}

	public List<UserProjectsSumByYearModel> getUserProjectsSumByYearList() {
		return userProjectsSumByYearList;
	}

	public void setUserProjectsSumByYearList(List<UserProjectsSumByYearModel> userProjectsSumByYearList) {
		this.userProjectsSumByYearList = userProjectsSumByYearList;
	}

	public List<UserSkillsSumByKindBean> getUserSkillsSumByKindBeanList() {
		return userSkillsSumByKindBeanList;
	}

	public void setUserSkillsSumByKindBeanList(List<UserSkillsSumByKindBean> userSkillsSumByKindBeanList) {
		this.userSkillsSumByKindBeanList = userSkillsSumByKindBeanList;
	}

	public UserProjectTechModel getUserProjectTech() {
		return userProjectTech;
	}

	public void setUserProjectTech(UserProjectTechModel userProjectTech) {
		this.userProjectTech = userProjectTech;
	}

	public List<UserProjectTechModel> getUserProjectTechList() {
		return userProjectTechList;
	}

	public void setUserProjectTechList(List<UserProjectTechModel> userProjectTechList) {
		this.userProjectTechList = userProjectTechList;
	}

	public MTechModel getmTech() {
		return mTech;
	}

	public void setmTech(MTechModel mTech) {
		this.mTech = mTech;
	}

	public List<MTechModel> getmTechList() {
		return mTechList;
	}

	public void setmTechList(List<MTechModel> mTechList) {
		this.mTechList = mTechList;
	}

	public SltMTechPara getSltMTechPara() {
		return sltMTechPara;
	}

	public void setSltMTechPara(SltMTechPara sltMTechPara) {
		this.sltMTechPara = sltMTechPara;
	}

	public List<MTechDetailModel> getmTechDetailList() {
		return mTechDetailList;
	}

	public void setmTechDetailList(List<MTechDetailModel> mTechDetailList) {
		this.mTechDetailList = mTechDetailList;
	}

	public SltMTechDetailPara getSltMTechDetailPara() {
		return sltMTechDetailPara;
	}

	public void setSltMTechDetailPara(SltMTechDetailPara sltMTechDetailPara) {
		this.sltMTechDetailPara = sltMTechDetailPara;
	}

	public List<MRoleModel> getmRoleList() {
		return mRoleList;
	}

	public void setmRoleList(List<MRoleModel> mRoleList) {
		this.mRoleList = mRoleList;
	}

	public SltMRolePara getSltMRolePara() {
		return sltMRolePara;
	}

	public void setSltMRolePara(SltMRolePara sltMRolePara) {
		this.sltMRolePara = sltMRolePara;
	}

	public List<MIndustryModel> getmIndustryList() {
		return mIndustryList;
	}

	public void setmIndustryList(List<MIndustryModel> mIndustryList) {
		this.mIndustryList = mIndustryList;
	}

	public SltMIndustryPara getSltMIndustryPara() {
		return sltMIndustryPara;
	}

	public void setSltMIndustryPara(SltMIndustryPara sltMIndustryPara) {
		this.sltMIndustryPara = sltMIndustryPara;
	}

	public NotificationModel getNotification() {
		return notification;
	}

	public void setNotification(NotificationModel notification) {
		this.notification = notification;
	}

	public List<NotificationModel> getNotificationList() {
		return notificationList;
	}

	public void setNotificationList(List<NotificationModel> notificationList) {
		this.notificationList = notificationList;
	}

	public List<MTechJoinUserSkillsModel> getmTechJoinUserSkillsList() {
		return mTechJoinUserSkillsList;
	}

	public void setmTechJoinUserSkillsList(List<MTechJoinUserSkillsModel> mTechJoinUserSkillsList) {
		this.mTechJoinUserSkillsList = mTechJoinUserSkillsList;
	}

	public List<UserProjectsJoinMroleModel> getUserProjectsJoinMroleList() {
		return userProjectsJoinMroleList;
	}

	public void setUserProjectsJoinMroleList(List<UserProjectsJoinMroleModel> userProjectsJoinMroleList) {
		this.userProjectsJoinMroleList = userProjectsJoinMroleList;
	}

	public List<UserProjectsJoinMindustryModel> getUserProjectsJoinMindustryList() {
		return userProjectsJoinMindustryList;
	}

	public void setUserProjectsJoinMindustryList(List<UserProjectsJoinMindustryModel> userProjectsJoinMindustryList) {
		this.userProjectsJoinMindustryList = userProjectsJoinMindustryList;
	}

	public List<MIndustryJoinUserCareerModel> getmIndustryJoinUserCareerList() {
		return mIndustryJoinUserCareerList;
	}

	public void setmIndustryJoinUserCareerList(List<MIndustryJoinUserCareerModel> mIndustryJoinUserCareerList) {
		this.mIndustryJoinUserCareerList = mIndustryJoinUserCareerList;
	}

	public List<UserCareerRoleSumBean> getUserCareerRoleSumBeanList() {
		return userCareerRoleSumBeanList;
	}

	public void setUserCareerRoleSumBeanList(List<UserCareerRoleSumBean> userCareerRoleSumBeanList) {
		this.userCareerRoleSumBeanList = userCareerRoleSumBeanList;
	}

	public List<UserProjectsJoinTechModel> getUserProjectsJoinTechList() {
		return userProjectsJoinTechList;
	}

	public void setUserProjectsJoinTechList(List<UserProjectsJoinTechModel> userProjectsJoinTechList) {
		this.userProjectsJoinTechList = userProjectsJoinTechList;
	}

	public List<UserProjectsTechJoinTechModel> getUserProjectsTechJoinTechList() {
		return userProjectsTechJoinTechList;
	}

	public void setUserProjectsTechJoinTechList(List<UserProjectsTechJoinTechModel> userProjectsTechJoinTechList) {
		this.userProjectsTechJoinTechList = userProjectsTechJoinTechList;
	}

	public UserCareerModel getUserCareer() {
		return userCareer;
	}

	public void setUserCareer(UserCareerModel userCareer) {
		this.userCareer = userCareer;
	}

	public List<UserCareerModel> getUserCareerList() {
		return userCareerList;
	}

	public void setUserCareerList(List<UserCareerModel> userCareerList) {
		this.userCareerList = userCareerList;
	}

	public List<UserCareerChartBean> getUserCareerChartBeanList() {
		return userCareerChartBeanList;
	}

	public void setUserCareerChartBeanList(List<UserCareerChartBean> userCareerChartBeanList) {
		this.userCareerChartBeanList = userCareerChartBeanList;
	}

}
