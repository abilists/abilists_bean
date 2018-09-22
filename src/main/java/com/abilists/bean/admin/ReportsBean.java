package com.abilists.bean.admin;

import com.abilists.bean.model.works.UserReportsModel;

public class ReportsBean {

	private UserReportsModel userReports;
	private String userImgData;

	public UserReportsModel getUserReports() {
		return userReports;
	}
	public void setUserReports(UserReportsModel userReports) {
		this.userReports = userReports;
	}
	public String getUserImgData() {
		return userImgData;
	}
	public void setUserImgAvatar(String userImgData) {
		this.userImgData = userImgData;
	}

}
