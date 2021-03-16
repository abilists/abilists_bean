package com.abilists.bean.para.admin.users;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;

public class IstMTeamPara extends CommonPara {

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=100, charset="UTF-8", message="parameter.error.size.max100.message") // 100
	private String mtmUserId;
	private String mtmUserName;
	private String mtmStatus;
	private String adminId;

	public String getMtmUserId() {
		return mtmUserId;
	}

	public void setMtmUserId(String mtmUserId) {
		this.mtmUserId = mtmUserId;
	}

	public String getMtmUserName() {
		return mtmUserName;
	}

	public void setMtmUserName(String mtmUserName) {
		this.mtmUserName = mtmUserName;
	}

	public String getMtmStatus() {
		return mtmStatus;
	}

	public void setMtmStatus(String mtmStatus) {
		this.mtmStatus = mtmStatus;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

    
}