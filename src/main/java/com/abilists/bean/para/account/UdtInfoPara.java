package com.abilists.bean.para.account;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;

public class UdtInfoPara extends CommonPara {

    @CharacterEscape(message = "parameter.error.escape.character.message")
	// @EmptyMaxSize(max=30, message = "parameter.error.size.max30.message")
    @ByteString(min=1, max=100, charset="UTF-8", message="parameter.error.size.max100.message") // 100
	private String userName;

    private String userSex;

    private String userAges;

    @CharacterEscape(message = "parameter.error.escape.character.message")
	@ByteString(min=1, max=250, charset="UTF-8", message="parameter.error.size.max250.message") // 300
    private String userProfile;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserAges() {
		return userAges;
	}

	public void setUserAges(String userAges) {
		this.userAges = userAges;
	}

	public String getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}

}
