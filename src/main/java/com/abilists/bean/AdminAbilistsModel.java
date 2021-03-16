package com.abilists.bean;

import java.util.List;

import com.abilists.bean.admin.ReportsBean;
import com.abilists.bean.admin.SkillsLevelBean;
import com.abilists.bean.admin.license.LicenseBean;
import com.abilists.bean.admin.plugins.ApiPluginBean;
import com.abilists.bean.admin.plugins.PartnerBean;
import com.abilists.bean.admin.system.DbUserBean;
import com.abilists.bean.admin.system.SysLdapBean;
import com.abilists.bean.admin.system.SysTomcatBean;
import com.abilists.bean.model.admin.AdminModel;
import com.abilists.bean.model.admin.MSystemModel;
import com.abilists.bean.model.admin.plugins.MPluginsModel;
import com.abilists.bean.model.admin.users.MCompanyModel;
import com.abilists.bean.model.admin.users.MDepartmentModel;
import com.abilists.bean.model.admin.users.MTeamModel;
import com.abilists.bean.model.sum.AdminUsersSumByYearModel;
import com.abilists.bean.model.sum.UserProjectsSumByYearModel;
import com.abilists.bean.model.works.UserReportsModel;

import base.bean.model.CommonModel;
import io.utility.email.SmtpBean;

public class AdminAbilistsModel extends CommonModel {

	private AdminModel admin;
	private List<AdminModel> adminList;

	private List<AdminUsersSumByYearModel> adminUsersSumByYearList;
	private List<UserProjectsSumByYearModel> userProjectsSumByYearList;

	private List<ReportsBean> reportsBeanList;
	private List<UserReportsModel> userReportsList;
	private List<ReportsBean> userReportsSumList;

	private List<MCompanyModel> mCompanyList;
	private MCompanyModel mCompany;
	private List<MDepartmentModel> mDepartmentList;
	private List<MTeamModel> mTeamList;
	private int mTeamSum;

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
	private List<MPluginsModel> pluginsList;

	// System
	private DbUserBean dbUserBean;
	private SmtpBean smtpBean;
	private SysLdapBean sysLdapBean;
	private SysTomcatBean sysTomcatBean;

	private MSystemModel mSystem;

	private LicenseBean licenseBean;

	public AdminModel getAdmin() {
		return admin;
	}

	public void setAdmin(AdminModel admin) {
		this.admin = admin;
	}

	public List<AdminModel> getAdminList() {
		return adminList;
	}

	public void setAdminList(List<AdminModel> adminList) {
		this.adminList = adminList;
	}

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

	public List<ReportsBean> getUserReportsSumList() {
		return userReportsSumList;
	}

	public void setUserReportsSumList(List<ReportsBean> userReportsSumList) {
		this.userReportsSumList = userReportsSumList;
	}

	public List<MCompanyModel> getmCompanyList() {
		return mCompanyList;
	}

	public void setmCompanyList(List<MCompanyModel> mCompanyList) {
		this.mCompanyList = mCompanyList;
	}

	public MCompanyModel getmCompany() {
		return mCompany;
	}

	public void setmCompany(MCompanyModel mCompany) {
		this.mCompany = mCompany;
	}

	public List<MDepartmentModel> getmDepartmentList() {
		return mDepartmentList;
	}

	public void setmDepartmentList(List<MDepartmentModel> mDepartmentList) {
		this.mDepartmentList = mDepartmentList;
	}

	public List<MTeamModel> getmTeamList() {
		return mTeamList;
	}

	public void setmTeamList(List<MTeamModel> mTeamList) {
		this.mTeamList = mTeamList;
	}

	public int getmTeamSum() {
		return mTeamSum;
	}

	public void setmTeamSum(int mTeamSum) {
		this.mTeamSum = mTeamSum;
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

	public List<MPluginsModel> getPluginsList() {
		return pluginsList;
	}

	public void setPluginsList(List<MPluginsModel> pluginsList) {
		this.pluginsList = pluginsList;
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

	public LicenseBean getLicenseBean() {
		return licenseBean;
	}

	public void setLicenseBean(LicenseBean licenseBean) {
		this.licenseBean = licenseBean;
	}

}