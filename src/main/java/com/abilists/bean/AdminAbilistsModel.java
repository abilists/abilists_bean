package com.abilists.bean;

import java.util.HashMap;
import java.util.List;

import com.abilists.bean.admin.ReportsBean;
import com.abilists.bean.admin.SkillsLevelBean;
import com.abilists.bean.admin.plugins.ApiPluginBean;
import com.abilists.bean.admin.plugins.PartnerBean;
import com.abilists.bean.admin.system.DbUserBean;
import com.abilists.bean.admin.system.SysLdapBean;
import com.abilists.bean.admin.system.SysTomcatBean;
import com.abilists.bean.model.admin.MSystemModel;
import com.abilists.bean.model.admin.sum.AdminUserReportsSumModel;
import com.abilists.bean.model.sum.AdminUsersSumByYearModel;
import com.abilists.bean.model.sum.UserProjectsSumByYearModel;
import com.abilists.bean.model.works.UserReportsModel;

import base.bean.model.CommonModel;
import io.utility.email.SmtpBean;

public class AdminAbilistsModel extends CommonModel {

	private List<AdminUsersSumByYearModel> adminUsersSumByYearList;
	private List<UserProjectsSumByYearModel> userProjectsSumByYearList;

	private List<ReportsBean> reportsBeanList;
	private List<UserReportsModel> userReportsList;
	private HashMap<String, List<AdminUserReportsSumModel>> adminUserReportsSumMap;

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

	// Plugins
	private PartnerBean partnerBean;
	private ApiPluginBean apiPluginBean;

	// System
	private DbUserBean dbUserBean;
	private SmtpBean smtpBean;
	private SysLdapBean sysLdapBean;
	private SysTomcatBean sysTomcatBean;

	private MSystemModel mSystem;

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

	public List<ReportsBean> getReportsBeanList() {
		return reportsBeanList;
	}

	public void setReportsBeanList(List<ReportsBean> reportsBeanList) {
		this.reportsBeanList = reportsBeanList;
	}

	public List<UserReportsModel> getUserReportsList() {
		return userReportsList;
	}

	public void setUserReportsList(List<UserReportsModel> userReportsList) {
		this.userReportsList = userReportsList;
	}

	public HashMap<String, List<AdminUserReportsSumModel>> getAdminUserReportsSumMap() {
		return adminUserReportsSumMap;
	}

	public void setAdminUserReportsSumMap(HashMap<String, List<AdminUserReportsSumModel>> adminUserReportsSumMap) {
		this.adminUserReportsSumMap = adminUserReportsSumMap;
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

	public PartnerBean getPartnerBean() {
		return partnerBean;
	}

	public void setPartnerBean(PartnerBean partnerBean) {
		this.partnerBean = partnerBean;
	}

	public ApiPluginBean getApiPluginBean() {
		return apiPluginBean;
	}

	public void setApiPluginBean(ApiPluginBean apiPluginBean) {
		this.apiPluginBean = apiPluginBean;
	}

	public DbUserBean getDbUserBean() {
		return dbUserBean;
	}

	public void setDbUserBean(DbUserBean dbUserBean) {
		this.dbUserBean = dbUserBean;
	}

	public SmtpBean getSmtpBean() {
		return smtpBean;
	}

	public void setSmtpBean(SmtpBean smtpBean) {
		this.smtpBean = smtpBean;
	}

	public SysLdapBean getSysLdapBean() {
		return sysLdapBean;
	}

	public void setSysLdapBean(SysLdapBean sysLdapBean) {
		this.sysLdapBean = sysLdapBean;
	}

	public SysTomcatBean getSysTomcatBean() {
		return sysTomcatBean;
	}

	public void setSysTomcatBean(SysTomcatBean sysTomcatBean) {
		this.sysTomcatBean = sysTomcatBean;
	}

	public MSystemModel getmSystem() {
		return mSystem;
	}

	public void setmSystem(MSystemModel mSystem) {
		this.mSystem = mSystem;
	}

}