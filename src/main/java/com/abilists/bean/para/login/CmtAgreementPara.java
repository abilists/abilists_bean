package com.abilists.bean.para.login;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.BitAllowString;

public class CmtAgreementPara extends CommonPara {

    @NotNull(message = "login.signup.title0")
    @BitAllowString(message = "parameter.error.bit.message")
	private String useAgree;

    @NotNull(message = "login.signup.title0")
    @BitAllowString(message = "parameter.error.bit.message")
	private String priAgree;

	public String getUseAgree() {
		return useAgree;
	}

	public void setUseAgree(String useAgree) {
		this.useAgree = useAgree;
	}

	public String getPriAgree() {
		return priAgree;
	}

	public void setPriAgree(String priAgree) {
		this.priAgree = priAgree;
	}

}