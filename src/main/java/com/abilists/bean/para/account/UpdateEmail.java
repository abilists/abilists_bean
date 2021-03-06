package com.abilists.bean.para.account;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.EscapePassword;

public class UpdateEmail extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Email(message = "You should form for email.")
    @Size(min = 1, max = 45 ,message = "newUserEmail must not exceed {max} characters")
	private String newUserEmail;

	@NotNull(message = "parameter.error.null.message")
    @EscapePassword(message = "parameter.error.escape.password.message")
    @Size(min = 1, max = 45 ,message = "userPwd must not exceed {max} characters")
	private String userPwd;

	public String getNewUserEmail() {
		return newUserEmail;
	}

	public void setNewUserEmail(String newUserEmail) {
		this.newUserEmail = newUserEmail;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

}
