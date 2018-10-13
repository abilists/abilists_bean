package com.abilists.bean.para.users;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.StringByte;

public class UdtUsersPara extends CommonPara {

	private String userAuth;
	private String userStatus;
	private String userDelete;

	// @CharacterEscape(message = "parameter.error.escape.character.message")
	@StringByte(charset = "ms949", min = 1, max = 8000, message = "parameter.error.size.max8000.message")
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
