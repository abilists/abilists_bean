package com.abilists.bean.para.profile;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;

public class IstUserCareerPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@CharacterEscape(message = "parameter.error.escape.character.message")
	@ByteString(charset = "UTF-8", min = 1, max = 200, message = "parameter.error.size.max200.message") // 200
	private String ucCompanyName;
	
	private String ucPresent;
	
	@NotNull(message = "parameter.error.null.message")
	private String ucStartMonth;
	
	@NotNull(message = "parameter.error.null.message")
	private String ucStartYear;
	
	private String ucEndMonth;
	private String ucEndYear;
	private String ucTitle;

	// @CharacterEscape(message = "parameter.error.escape.character.message")
	@ByteString(charset = "UTF-8", min = 1, max = 4900, message = "parameter.error.size.max4900.message") // 5000
	private String ucContents;

	private String ucCodeIndustry;
	private String ucCodeRole;
	private String mrNo;
	private String miNo;
	private String ucStatus;

	public String getUcCompanyName() {
		return ucCompanyName;
	}
	public void setUcCompanyName(String ucCompanyName) {
		this.ucCompanyName = ucCompanyName;
	}
	public String getUcPresent() {
		return ucPresent;
	}
	public void setUcPresent(String ucPresent) {
		this.ucPresent = ucPresent;
	}
	public String getUcStartMonth() {
		return ucStartMonth;
	}
	public void setUcStartMonth(String ucStartMonth) {
		this.ucStartMonth = ucStartMonth;
	}
	public String getUcStartYear() {
		return ucStartYear;
	}
	public void setUcStartYear(String ucStartYear) {
		this.ucStartYear = ucStartYear;
	}
	public String getUcEndMonth() {
		return ucEndMonth;
	}
	public void setUcEndMonth(String ucEndMonth) {
		this.ucEndMonth = ucEndMonth;
	}
	public String getUcEndYear() {
		return ucEndYear;
	}
	public void setUcEndYear(String ucEndYear) {
		this.ucEndYear = ucEndYear;
	}
	public String getUcTitle() {
		return ucTitle;
	}
	public void setUcTitle(String ucTitle) {
		this.ucTitle = ucTitle;
	}
	public String getUcContents() {
		return ucContents;
	}
	public void setUcContents(String ucContents) {
		this.ucContents = ucContents;
	}
	public String getMrNo() {
		return mrNo;
	}
	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}
	public String getMiNo() {
		return miNo;
	}
	public void setMiNo(String miNo) {
		this.miNo = miNo;
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
	public String getUcStatus() {
		return ucStatus;
	}
	public void setUcStatus(String ucStatus) {
		this.ucStatus = ucStatus;
	}

}