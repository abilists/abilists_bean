package com.abilists.bean.para.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import base.bean.para.CommonPara;

public class SignUpPara extends CommonPara {

    @NotNull(message = "login.signup.title0")
    @Email(message = "login.signup.email.text1")
    @Size(min = 1, max = 45 ,message = "Email address must not exceed {max} characters")
	private String userEmail;

	private String userStatus;

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

}