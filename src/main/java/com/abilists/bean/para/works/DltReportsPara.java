package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class DltReportsPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String urNo;

	public String getUrNo() {
		return urNo;
	}

	public void setUrNo(String urNo) {
		this.urNo = urNo;
	}

}