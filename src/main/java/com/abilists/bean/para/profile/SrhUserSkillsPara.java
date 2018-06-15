package com.abilists.bean.para.profile;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class SrhUserSkillsPara extends CommonPara {

	@CharacterEscape
	private String userId;
	@CharacterEscape
	private String userName;
	@CharacterEscape
	private String upIndustrial;
	@CharacterEscape
	private String usKind;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUpIndustrial() {
		return upIndustrial;
	}

	public void setUpIndustrial(String upIndustrial) {
		this.upIndustrial = upIndustrial;
	}

	public String getUsKind() {
		return usKind;
	}

	public void setUsKind(String usKind) {
		this.usKind = usKind;
	}

}