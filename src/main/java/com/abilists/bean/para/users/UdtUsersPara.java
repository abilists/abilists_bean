package com.abilists.bean.para.users;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;

public class UdtUsersPara extends CommonPara {

	private String userAuth;
	private String userStatus;
	private String userDelete;

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@ByteString(min=1, max=7900, charset="UTF-8", message="parameter.error.size.max7900.message") // 8000
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
