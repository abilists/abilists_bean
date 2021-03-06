package com.abilists.bean.para.users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;

public class UpdateSettingsPara {

    private String userAuth;

    @NotNull(message = "userName")
    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 90 ,message = "userName must not exceed {max} characters")
	private String userName;

    private String userSex;

    private String userEmail;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(charset = "UTF-8", min = 1, max = 250, message = "parameter.error.size.max250.message") // 300
    private String userProfile;

	public String getUserAuth() {
		return userAuth;
	}

	public void setUserAuth(String userAuth) {
		this.userAuth = userAuth;
	}

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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}

}
