package com.abilists.bean.para.admin.users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class DldFileResumePara extends CommonPara {

	private String ufKind;

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String ufNo;

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String ufNum;
	
	private String targetUserId;

	public String getUfKind() {
		return ufKind;
	}

	public void setUfKind(String ufKind) {
		this.ufKind = ufKind;
	}

	public String getUfNo() {
		return ufNo;
	}

	public void setUfNo(String ufNo) {
		this.ufNo = ufNo;
	}

	public String getUfNum() {
		return ufNum;
	}

	public void setUfNum(String ufNum) {
		this.ufNum = ufNum;
	}

	public String getTargetUserId() {
		return targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}

}