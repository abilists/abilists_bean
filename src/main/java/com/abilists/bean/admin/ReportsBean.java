package com.abilists.bean.admin;

import com.abilists.bean.model.works.UserReportsModel;

public class ReportsBean {

	private UserReportsModel userReports;
	private String userImgAvatar;

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

}
