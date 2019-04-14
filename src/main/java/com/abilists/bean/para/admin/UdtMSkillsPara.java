package com.abilists.bean.para.admin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UdtMSkillsPara extends IstMSkillsPara {

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String msNo;

	public String getMsNo() {
		return msNo;
	}
	public void setMsNo(String msNo) {
		this.msNo = msNo;
	}

}