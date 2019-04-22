package com.abilists.bean.para.account;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.AllowString;

public class UdtOptionsPara extends CommonPara {

	private String uoOption;
	@AllowString(message = "parameter.error.escape.password.message")
	private String uoValue;

	public String getUoOption() {
		return uoOption;
	}
	public void setUoOption(String uoOption) {
		this.uoOption = uoOption;
	}
	public String getUoValue() {
		return uoValue;
	}
	public void setUoValue(String uoValue) {
		this.uoValue = uoValue;
	}

}