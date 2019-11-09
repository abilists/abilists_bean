package com.abilists.bean.para.profile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class DltUserHashtagsPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String uhNo;

	public String getUhNo() {
		return uhNo;
	}

	public void setUhNo(String uhNo) {
		this.uhNo = uhNo;
	}

}