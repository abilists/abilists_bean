package com.abilists.bean.para.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.EscapePassword;

public class CompleteResetPwdPara extends CommonPara {

    @NotNull(message = "password.")
    @EscapePassword(message = "There is not good password1.")
    @Size(min = 1, max = 45 ,message = "password must not exceed {max} characters")
	private String password;

    @NotNull(message = "password2.")
    @EscapePassword(message = "There is not good password2.")
    @Size(min = 1, max = 45 ,message = "password2 must not exceed {max} characters")
	private String password2;

    @NotNull(message = "ntoken")
    @Size(min = 1, max = 300 ,message = "ntoken must not exceed {max} characters")
	private String ntoken;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getNtoken() {
		return ntoken;
	}

	public void setNtoken(String ntoken) {
		this.ntoken = ntoken;
	}


}