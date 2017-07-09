package com.abilists.bean.para.users;

import javax.validation.constraints.Size;

import com.abilists.bean.para.CommonPara;

import io.utility.validate.annotation.CharacterEscape;

public class UdtUsersPara extends CommonPara {

	private String userAuth;
	private String userStatus;
	private String userDelete;

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@Size(min = 1, max = 700, message = "parameter.error.size.max700.message")
	private String userSummary;
	
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
	public String getUserSummary() {
		return userSummary;
	}
	public void setUserSummary(String userSummary) {
		this.userSummary = userSummary;
	}

}
