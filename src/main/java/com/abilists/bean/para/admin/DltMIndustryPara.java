package com.abilists.bean.para.admin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class DltMIndustryPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
    private String miNo;

	public String getMiNo() {
		return miNo;
	}

	public void setMiNo(String miNo) {
		this.miNo = miNo;
	}

}
