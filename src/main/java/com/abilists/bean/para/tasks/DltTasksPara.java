package com.abilists.bean.para.tasks;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class DltTasksPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String utNo;

	public String getUtNo() {
		return utNo;
	}

	public void setUtNo(String utNo) {
		this.utNo = utNo;
	}

}