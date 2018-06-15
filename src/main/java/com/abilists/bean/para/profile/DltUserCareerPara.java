package com.abilists.bean.para.profile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class DltUserCareerPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String ucNo;

	public String getUcNo() {
		return ucNo;
	}

	public void setUcNo(String ucNo) {
		this.ucNo = ucNo;
	}

}