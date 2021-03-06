package com.abilists.bean.model.master;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class MRoleModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long mrNo;
	private String mrName;
	private String mrCode;
	private String mrExplain;
	private String mrSkills;
	private String mrPrefers;
	private String mlCode;
	private String mrStatus;
	private String mrDelete;
	private Date insertTime;
	private Date updateTime;

	public long getMrNo() {
		return mrNo;
	}
	public void setMrNo(long mrNo) {
		this.mrNo = mrNo;
	}
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
