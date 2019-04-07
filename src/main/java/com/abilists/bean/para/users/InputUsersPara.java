package com.abilists.bean.para.users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;

public class InputUsersPara {

	@NotNull(message = "userId")
	@CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 90 ,message = "userId must not exceed {max} characters")
	private String userId;

    @NotNull(message = "userPwd")
    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 150 ,message = "userPwd must not exceed {max} characters")
    private String userPwd;

    @NotNull(message = "userName")
    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 90 ,message = "userName must not exceed {max} characters")
	private String userName;

    private String userSex;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    private String userEmail;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(charset = "UTF-8", min = 1, max = 250, message = "parameter.error.size.max250.message") // 300
    private String userProfile;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
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
