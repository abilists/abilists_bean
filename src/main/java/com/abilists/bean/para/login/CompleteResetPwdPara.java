package com.abilists.bean.para.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.EscapePassword;

public class CompleteResetPwdPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @EscapePassword(message = "parameter.error.escape.password.message")
    @Size(min = 8, max = 30 ,message = "parameter.error.size.min10.max30.new.password.message") // 100 encrypted
	private String password;

	@NotNull(message = "parameter.error.null.message")
    @EscapePassword(message = "parameter.error.escape.password.message")
    @Size(min = 8, max = 30 ,message = "parameter.error.size.min10.max30.new.password.message") // 100 encrypted
	private String password2;

    @NotNull(message = "ntoken")
    @Size(min = 1, max = 200 ,message = "ntoken must not exceed {max} characters")
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