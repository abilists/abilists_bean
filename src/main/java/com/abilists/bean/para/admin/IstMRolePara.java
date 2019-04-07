package com.abilists.bean.para.admin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class IstMRolePara  extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String mrName;
	
	private String mrCode;
	private String mrExplain;
	private String mrResponsibilities;
	private String mrWorks;
	private String mrSkills;
	private String mrPrefers;
	
	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String mlCode;
	
	private String mrStatus;
	private String mrDelete;

	public String getMrName() {
		return mrName;
	}
	public void setMrName(String mrName) {
		this.mrName = mrName;
	}
	public String getMrCode() {
		return mrCode;
	}
	public void setMrCode(String mrCode) {
		this.mrCode = mrCode;
	}
	public String getMrExplain() {
		return mrExplain;
	}
	public void setMrExplain(String mrExplain) {
		this.mrExplain = mrExplain;
	}
	public String getMrResponsibilities() {
		return mrResponsibilities;
	}
	public void setMrResponsibilities(String mrResponsibilities) {
		this.mrResponsibilities = mrResponsibilities;
	}
	public String getMrWorks() {
		return mrWorks;
	}
	public void setMrWorks(String mrWorks) {
		this.mrWorks = mrWorks;
	}
	public String getMrSkills() {
		return mrSkills;
	}
	public void setMrSkills(String mrSkills) {
		this.mrSkills = mrSkills;
	}
	public String getMrPrefers() {
		return mrPrefers;
	}
	public void setMrPrefers(String mrPrefers) {
		this.mrPrefers = mrPrefers;
	}
	public String getMlCode() {
		return mlCode;
	}
	public void setMlCode(String mlCode) {
		this.mlCode = mlCode;
	}
	public String getMrStatus() {
		return mrStatus;
	}
	public void setMrStatus(String mrStatus) {
		this.mrStatus = mrStatus;
	}
	public String getMrDelete() {
		return mrDelete;
	}
	public void setMrDelete(String mrDelete) {
		this.mrDelete = mrDelete;
	}

}