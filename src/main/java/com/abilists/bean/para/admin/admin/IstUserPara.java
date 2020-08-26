package com.abilists.bean.para.admin.admin;

import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class IstUserPara extends CommonPara {

    @Size(min = 1, max = 100 ,message = "parameter.error.size.max100.message")
	private String targetUserId;

	public String getTargetUserId() {
		return targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}

}