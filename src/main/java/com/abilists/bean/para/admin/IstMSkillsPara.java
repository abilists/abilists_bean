package com.abilists.bean.para.admin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class IstMSkillsPara extends CommonPara {

	private String msNo;
	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String msSkill;
	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String msKind;
	private String msName;
	private String msVersion;
	private String msExplain;
	private String msRelation;
	private String msTrend;
	private String msStatus;
	private String msDelete;

	public String getMsNo() {
		return msNo;
	}
	public void setMsNo(String msNo) {
		this.msNo = msNo;
	}
	public String getMsSkill() {
		return msSkill;
	}
	public void setMsSkill(String msSkill) {
		this.msSkill = msSkill;
	}
	public String getMsKind() {
		return msKind;
	}
	public void setMsKind(String msKind) {
		this.msKind = msKind;
	}
	public String getMsName() {
		return msName;
	}
	public void setMsName(String msName) {
		this.msName = msName;
	}
	public String getMsVersion() {
		return msVersion;
	}
	public void setMsVersion(String msVersion) {
		this.msVersion = msVersion;
	}
	public String getMsExplain() {
		return msExplain;
	}
	public void setMsExplain(String msExplain) {
		this.msExplain = msExplain;
	}
	public String getMsRelation() {
		return msRelation;
	}
	public void setMsRelation(String msRelation) {
		this.msRelation = msRelation;
	}
	public String getMsTrend() {
		return msTrend;
	}
	public void setMsTrend(String msTrend) {
		this.msTrend = msTrend;
	}
	public String getMsStatus() {
		return msStatus;
	}
	public void setMsStatus(String msStatus) {
		this.msStatus = msStatus;
	}
	public String getMsDelete() {
		return msDelete;
	}
	public void setMsDelete(String msDelete) {
		this.msDelete = msDelete;
	}

}