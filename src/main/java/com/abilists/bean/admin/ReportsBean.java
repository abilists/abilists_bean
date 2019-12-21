package com.abilists.bean.admin;

import java.util.List;

import com.abilists.bean.model.admin.sum.AdminUserReportsSumModel;
import com.abilists.bean.model.works.UserReportsModel;

public class ReportsBean {

	private UserReportsModel userReports;
	private String userImgAvatar;
	private List<AdminUserReportsSumModel> adminUserReportsSumList; 

	public UserReportsModel getUserReports() {
		return userReports;
	}
	public void setUserReports(UserReportsModel userReports) {
		this.userReports = userReports;
	}
	public String getUserImgAvatar() {
		return userImgAvatar;
	}
	public void setUserImgAvatar(String userImgAvatar) {
		this.userImgAvatar = userImgAvatar;
	}
	public List<AdminUserReportsSumModel> getAdminUserReportsSumList() {
		return adminUserReportsSumList;
	}
	public void setAdminUserReportsSumList(List<AdminUserReportsSumModel> adminUserReportsSumList) {
		this.adminUserReportsSumList = adminUserReportsSumList;
	}

}
