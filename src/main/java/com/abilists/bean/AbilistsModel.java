package com.abilists.bean;

import java.util.List;

import com.abilists.bean.model.NotificationModel;
import com.abilists.bean.model.account.UsersModel;
import com.abilists.bean.model.admin.plugins.MPluginsModel;
import com.abilists.bean.model.join.MIndustryJoinUserCareerModel;
import com.abilists.bean.model.join.MTechJoinUserSkillsModel;
import com.abilists.bean.model.join.UserProjectsJoinMindustryModel;
import com.abilists.bean.model.join.UserProjectsJoinMroleModel;
import com.abilists.bean.model.join.UserProjectsJoinTechModel;
import com.abilists.bean.model.join.UserProjectsTechJoinTechModel;
import com.abilists.bean.model.list.UserMyListJoinUsersModel;
import com.abilists.bean.model.list.UserMyListModel;
import com.abilists.bean.model.master.MIndustryModel;
import com.abilists.bean.model.master.MRoleModel;
import com.abilists.bean.model.master.MTechDetailModel;
import com.abilists.bean.model.master.MSkillsModel;
import com.abilists.bean.model.sum.UserMemoSumByMonthModel;
import com.abilists.bean.model.sum.UserProjectsSumByYearModel;
import com.abilists.bean.model.sum.UserSkillsSumBySkillModel;
import com.abilists.bean.model.user.UserCareerModel;
import com.abilists.bean.model.user.UserChartModel;
import com.abilists.bean.model.user.UserOptionsModel;
import com.abilists.bean.model.user.UserSkillsModel;
import com.abilists.bean.model.user.UserTemp;
import com.abilists.bean.model.works.UserMemoModel;
import com.abilists.bean.model.works.UserPostsModel;
import com.abilists.bean.model.works.UserProjectTechModel;
import com.abilists.bean.model.works.UserProjectsFilesModel;
import com.abilists.bean.model.works.UserProjectsModel;
import com.abilists.bean.model.works.UserReportsModel;
import com.abilists.bean.model.works.UserTasksModel;
import com.abilists.bean.para.admin.SltMIndustryPara;
import com.abilists.bean.para.admin.SltMRolePara;
import com.abilists.bean.para.admin.SltMTechDetailPara;
import com.abilists.bean.para.admin.SltMSkillsPara;
import com.abilists.bean.para.list.SltMyListPara;
import com.abilists.bean.user.UserCareerChartBean;
import com.abilists.bean.user.UserCareerRoleSumBean;
import com.abilists.bean.user.UserSkillsSumBean;
import com.abilists.bean.user.UserSkillsSumByKindBean;
import com.abilists.bean.works.UserProjectsSumTotalBean;
import com.abilists.bean.works.UserTasksBean;

import base.bean.model.CommonModel;

public class AbilistsModel extends CommonModel {

	private UserTemp userTemp;
	private UsersModel users;
	private UserOptionsModel userOptions;
	private List<UserOptionsModel> userOptionsList;
	private List<UsersModel> usersList;

	private UserMyListModel userMyList;
	private List<UserMyListJoinUsersModel> userMyListList;
	private SltMyListPara sltMyListPara;

	private UserSkillsModel userSkills;
	private List<UserSkillsModel> userSkillsList;
	private List<UserSkillsSumBean> userSkillsSumBeanList;
	private List<UserSkillsSumBySkillModel> userSkillsSumBySkillList;

	private List<PostsBean> postsBeanList;
	private List<UserPostsModel> userPostsList;
	private List<UserChartModel> userChartList;
	
	private UserProjectsModel userProjects;
	private List<UserProjectsModel> userProjectsList;
	private List<UserProjectsFilesModel> userProjectsFilesList;
	private List<UserProjectsSumTotalBean> userProjectsSumTotalBeanList;

	private List<UserTasksModel> userTasksList;
	private UserTasksModel userTasks;
	private List<UserTasksBean> userTasksBeanList;

	private List<UserReportsModel> userReportsList;
	private UserReportsModel userReports;

	private List<UserMemoModel> userMemoList;
	private List<UserMemoSumByMonthModel> userMemoSumByMonthList;

	private List<UserProjectsSumByYearModel> userProjectsSumByYearList;
	private List<UserSkillsSumByKindBean> userSkillsSumByKindBeanList;

	private UserProjectTechModel userProjectTech;
	private List<UserProjectTechModel> userProjectTechList;
	private MSkillsModel mSkills;
	private List<MSkillsModel> mSkillsList;
	private SltMSkillsPara sltMSkillsPara;

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

	private List<MPluginsModel> mPluginsList;

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

	public UserOptionsModel getUserOptions() {
		return userOptions;
	}

	public void setUserOptions(UserOptionsModel userOptions) {
		this.userOptions = userOptions;
	}

	public List<UserOptionsModel> getUserOptionsList() {
		return userOptionsList;
	}

	public void setUserOptionsList(List<UserOptionsModel> userOptionsList) {
		this.userOptionsList = userOptionsList;
	}

	public List<UsersModel> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<UsersModel> usersList) {
		this.usersList = usersList;
	}

	public UserMyListModel getUserMyList() {
		return userMyList;
	}

	public void setUserMyList(UserMyListModel userMyList) {
		this.userMyList = userMyList;
	}

	public List<UserMyListJoinUsersModel> getUserMyListList() {
		return userMyListList;
	}

	public void setUserMyListList(List<UserMyListJoinUsersModel> userMyListList) {
		this.userMyListList = userMyListList;
	}

	public SltMyListPara getSltMyListPara() {
		return sltMyListPara;
	}

	public void setSltMyListPara(SltMyListPara sltMyListPara) {
		this.sltMyListPara = sltMyListPara;
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

	public List<PostsBean> getPostsBeanList() {
		return postsBeanList;
	}

	public void setPostsBeanList(List<PostsBean> postsBeanList) {
		this.postsBeanList = postsBeanList;
	}

	public List<UserPostsModel> getUserPostsList() {
		return userPostsList;
	}

	public void setUserPostsList(List<UserPostsModel> userPostsList) {
		this.userPostsList = userPostsList;
	}

	public List<UserChartModel> getUserChartList() {
		return userChartList;
	}

	public void setUserChartList(List<UserChartModel> userChartList) {
		this.userChartList = userChartList;
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

	public List<UserTasksModel> getUserTasksList() {
		return userTasksList;
	}

	public void setUserTasksList(List<UserTasksModel> userTasksList) {
		this.userTasksList = userTasksList;
	}

	public UserTasksModel getUserTasks() {
		return userTasks;
	}

	public void setUserTasks(UserTasksModel userTasks) {
		this.userTasks = userTasks;
	}

	public List<UserTasksBean> getUserTasksBeanList() {
		return userTasksBeanList;
	}

	public void setUserTasksBeanList(List<UserTasksBean> userTasksBeanList) {
		this.userTasksBeanList = userTasksBeanList;
	}

	public List<UserReportsModel> getUserReportsList() {
		return userReportsList;
	}

	public void setUserReportsList(List<UserReportsModel> userReportsList) {
		this.userReportsList = userReportsList;
	}

	public UserReportsModel getUserReports() {
		return userReports;
	}

	public void setUserReports(UserReportsModel userReports) {
		this.userReports = userReports;
	}

	public List<UserMemoModel> getUserMemoList() {
		return userMemoList;
	}

	public void setUserMemoList(List<UserMemoModel> userMemoList) {
		this.userMemoList = userMemoList;
	}

	public List<UserMemoSumByMonthModel> getUserMemoSumByMonthList() {
		return userMemoSumByMonthList;
	}

	public void setUserMemoSumByMonthList(List<UserMemoSumByMonthModel> userMemoSumByMonthList) {
		this.userMemoSumByMonthList = userMemoSumByMonthList;
	}

	public void setUserProjectsList(List<UserProjectsModel> userProjectsList) {
		this.userProjectsList = userProjectsList;
	}

	public List<UserProjectsFilesModel> getUserProjectsFilesList() {
		return userProjectsFilesList;
	}

	public void setUserProjectsFilesList(List<UserProjectsFilesModel> userProjectsFilesList) {
		this.userProjectsFilesList = userProjectsFilesList;
	}

	public List<UserProjectsSumTotalBean> getUserProjectsSumTotalBeanList() {
		return userProjectsSumTotalBeanList;
	}

	public void setUserProjectsSumTotalBeanList(List<UserProjectsSumTotalBean> userProjectsSumTotalBeanList) {
		this.userProjectsSumTotalBeanList = userProjectsSumTotalBeanList;
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

	public MSkillsModel getmSkills() {
		return mSkills;
	}

	public void setmSkills(MSkillsModel mSkills) {
		this.mSkills = mSkills;
	}

	public List<MSkillsModel> getmSkillsList() {
		return mSkillsList;
	}

	public void setmSkillsList(List<MSkillsModel> mSkillsList) {
		this.mSkillsList = mSkillsList;
	}

	public SltMSkillsPara getSltMSkillsPara() {
		return sltMSkillsPara;
	}

	public void setSltMSkillsPara(SltMSkillsPara sltMSkillsPara) {
		this.sltMSkillsPara = sltMSkillsPara;
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

	public List<MPluginsModel> getmPluginsList() {
		return mPluginsList;
	}

	public void setmPluginsList(List<MPluginsModel> mPluginsList) {
		this.mPluginsList = mPluginsList;
	}

}
