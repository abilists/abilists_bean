package com.abilists.bean.para.list;

import base.bean.para.CommonPara;

public class SrhMyListPara extends CommonPara {

    private String umlUserId;
    private String userName;
    private String userFirstName;
    private String userLastName;
    private String umlStatus;
    private String usSkill;
    private String sumUsLevel;

    // Icon in the Ascending and Descending
    private String cssClassName;
    // Flag in the Ascending and Descending
    private String flagSort;

	public String getUmlUserId() {
		return umlUserId;
	}

	public void setUmlUserId(String umlUserId) {
		this.umlUserId = umlUserId;
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

	public String getUmlStatus() {
		return umlStatus;
	}

	public void setUmlStatus(String umlStatus) {
		this.umlStatus = umlStatus;
	}

	public String getUsSkill() {
		return usSkill;
	}

	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
	}

	public String getSumUsLevel() {
		return sumUsLevel;
	}

	public void setSumUsLevel(String sumUsLevel) {
		this.sumUsLevel = sumUsLevel;
	}

	public String getCssClassName() {
		return cssClassName;
	}

	public void setCssClassName(String cssClassName) {
		this.cssClassName = cssClassName;
	}

	public String getFlagSort() {
		return flagSort;
	}

	public void setFlagSort(String flagSort) {
		this.flagSort = flagSort;
	}

}