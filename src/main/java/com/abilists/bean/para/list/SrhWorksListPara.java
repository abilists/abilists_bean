package com.abilists.bean.para.list;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class SrhWorksListPara extends CommonPara {

	@CharacterEscape
	private String upName;
	@CharacterEscape
    private String upCodeIndustry;
	@CharacterEscape
    private String upCodeRole;
	@CharacterEscape
    private String utTitle;
	@CharacterEscape
	private String utStatus;

	@CharacterEscape
	private String umMemo;

	public String getUpName() {
		return upName;
	}

	public void setUpName(String upName) {
		this.upName = upName;
	}

	public String getUpCodeIndustry() {
		return upCodeIndustry;
	}

	public void setUpCodeIndustry(String upCodeIndustry) {
		this.upCodeIndustry = upCodeIndustry;
	}

	public String getUpCodeRole() {
		return upCodeRole;
	}

	public void setUpCodeRole(String upCodeRole) {
		this.upCodeRole = upCodeRole;
	}

	public String getUtTitle() {
		return utTitle;
	}

	public void setUtTitle(String utTitle) {
		this.utTitle = utTitle;
	}

	public String getUtStatus() {
		return utStatus;
	}

	public void setUtStatus(String utStatus) {
		this.utStatus = utStatus;
	}

	public String getUmMemo() {
		return umMemo;
	}

	public void setUmMemo(String umMemo) {
		this.umMemo = umMemo;
	}

}