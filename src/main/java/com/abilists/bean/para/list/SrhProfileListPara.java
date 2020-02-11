package com.abilists.bean.para.list;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class SrhProfileListPara extends CommonPara {

	@CharacterEscape
	private String userId;
	@CharacterEscape
    private String userName;

	@CharacterEscape
    private String userFirstName;
	@CharacterEscape
    private String userLastName;
	
	@CharacterEscape
	private String ucTitle;
	@CharacterEscape
	private String ucCompanyName;

	@CharacterEscape
	private String ucCodeIndustry;
	@CharacterEscape
	private String ucCodeRole;

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
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUcTitle() {
		return ucTitle;
	}
	public void setUcTitle(String ucTitle) {
		this.ucTitle = ucTitle;
	}
	public String getUcCompanyName() {
		return ucCompanyName;
	}
	public void setUcCompanyName(String ucCompanyName) {
		this.ucCompanyName = ucCompanyName;
	}
	public String getUcCodeIndustry() {
		return ucCodeIndustry;
	}
	public void setUcCodeIndustry(String ucCodeIndustry) {
		this.ucCodeIndustry = ucCodeIndustry;
	}
	public String getUcCodeRole() {
		return ucCodeRole;
	}
	public void setUcCodeRole(String ucCodeRole) {
		this.ucCodeRole = ucCodeRole;
	}

}