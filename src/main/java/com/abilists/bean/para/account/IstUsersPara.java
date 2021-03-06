package com.abilists.bean.para.account;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;

public class IstUsersPara {

	@NotNull(message = "userId")
	@CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 100 ,message = "parameter.error.size.max100.message")
	private String userId;

    @NotNull(message = "userPwd")
    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 150 ,message = "parameter.error.size.max150.message")
    private String userPwd;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(charset = "UTF-8", min = 1, max = 50, message = "parameter.error.size.max50.message") // 50
	private String userFirstName;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(charset = "UTF-8", min = 1, max = 50, message = "parameter.error.size.max50.message") // 50
	private String userLastName;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(charset = "UTF-8", min = 1, max = 100, message = "parameter.error.size.max100.message")
	private String userName;

    private String userSex;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    private String userEmail;

    private long mcpNo;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    private String mcpDomain;
    
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

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
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

	public long getMcpNo() {
		return mcpNo;
	}

	public void setMcpNo(long mcpNo) {
		this.mcpNo = mcpNo;
	}

	public String getMcpDomain() {
		return mcpDomain;
	}

	public void setMcpDomain(String mcpDomain) {
		this.mcpDomain = mcpDomain;
	}

	public String getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}

}
