package com.abilists.bean.para.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.EscapePassword;

public class ComplateUpdatePwd extends CommonPara {

    @NotNull(message = "parameter.error.null.message")
    // @EscapePassword(message = "parameter.error.escape.password.message")
    @Size(min = 8, max = 30 ,message = "parameter.error.size.min8.max30.new.password.message") // 100 encrypted
	private String password;

    @NotNull(message = "parameter.error.null.message")
    // @EscapePassword(message = "parameter.error.escape.password.message")
    @Size(min = 8, max = 30 ,message = "parameter.error.size.min8.max30.new.password.message") // 100 encrypted
	private String password2;

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

}
