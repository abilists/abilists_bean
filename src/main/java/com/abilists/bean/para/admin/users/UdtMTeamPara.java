package com.abilists.bean.para.admin.users;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.IsInteger;

public class UdtMTeamPara extends CommonPara {

	@IsInteger(message = "parameter.error.integer.message")
	private String mtmNo;
	private String mtmUserId;
	private String adminId;

	public String getMtmNo() {
		return mtmNo;
	}

	public void setMtmNo(String mtmNo) {
		this.mtmNo = mtmNo;
	}

	public String getMtmUserId() {
		return mtmUserId;
	}

	public void setMtmUserId(String mtmUserId) {
		this.mtmUserId = mtmUserId;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

}