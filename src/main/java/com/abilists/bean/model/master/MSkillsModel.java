package com.abilists.bean.model.master;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class MSkillsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long msNo;
	private String msSkill;
	private String msKind;
	private String msName;
	private String msVersion;
	private String msExplain;
	private String msRelation;
	private String msStatus;
	private String msCriterion;
	private String msDelete;
	private Date insertTime;
	private Date updateTime;

	public long getMsNo() {
		return msNo;
	}
	public void setMsNo(long msNo) {
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
	public String getMsStatus() {
		return msStatus;
	}
	public void setMsStatus(String msStatus) {
		this.msStatus = msStatus;
	}
	public String getMsCriterion() {
		return msCriterion;
	}
	public void setMsCriterion(String msCriterion) {
		this.msCriterion = msCriterion;
	}
	public String getMsDelete() {
		return msDelete;
	}
	public void setMsDelete(String msDelete) {
		this.msDelete = msDelete;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
