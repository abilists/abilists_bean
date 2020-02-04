package com.abilists.bean.para.list;

import base.bean.para.CommonPara;

public class SltMyListPara extends CommonPara {

    private String umlNo;
    private String umlUserId;
    private String umlStatus;
    private String usSkill;

    // Icon in the Ascending and Descending
    private String cssClassName;
    // Flag in the Ascending and Descending
    private String flagSort;

	public String getUmlNo() {
		return umlNo;
	}

	public void setUmlNo(String umlNo) {
		this.umlNo = umlNo;
	}

	public String getUmlUserId() {
		return umlUserId;
	}

	public void setUmlUserId(String umlUserId) {
		this.umlUserId = umlUserId;
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