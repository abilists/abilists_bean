package com.abilists.bean.para.admin.users;

import base.bean.para.CommonPara;

public class UdtUsersPara extends CommonPara {

	private String userAuth;
	private String userStatus;
	private String userDelete;
	private String bltMCompany;
	private String userEmail;

	public String getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(String userAuth) {
		this.userAuth = userAuth;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserDelete() {
		return userDelete;
	}
	public void setUserDelete(String userDelete) {
		this.userDelete = userDelete;
	}
	public String getBltMCompany() {
		return bltMCompany;
	}
	public void setBltMCompany(String bltMCompany) {
		this.bltMCompany = bltMCompany;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
