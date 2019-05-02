package com.abilists.bean.para.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class ResetPwdPara extends CommonPara {

    @NotNull(message = "Please input the ntoken.")
    @Size(min = 1, max = 200 ,message = "ntoken must not exceed {max} characters")
	private String ntoken;

	public String getNtoken() {
		return ntoken;
	}

	public void setNtoken(String ntoken) {
		this.ntoken = ntoken;
	}

}