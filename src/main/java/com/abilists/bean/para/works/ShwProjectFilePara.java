package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class ShwProjectFilePara extends CommonPara {

	// upNo = ufNum
	private String upNo;

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String ufNo;
	
	private String targetUser;
	

	public String getUpNo() {
		return upNo;
	}

	public void setUpNo(String upNo) {
		this.upNo = upNo;
	}

	public String getUfNo() {
		return ufNo;
	}

	public void setUfNo(String ufNo) {
		this.ufNo = ufNo;
	}

	public String getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}

}