package com.abilists.bean.model.admin;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class MSystemModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int msysNo;
	private String msysKind;
	private String msysName;
	private String msysValue;
	private String msysLang;
	private String msysStatus;
	private String msysDelete;
	private Date insertTime;
	private Date updateTime;

	public int getMsysNo() {
		return msysNo;
	}
	public void setMsysNo(int msysNo) {
		this.msysNo = msysNo;
	}
	public String getMsysKind() {
		return msysKind;
	}
	public void setMsysKind(String msysKind) {
		this.msysKind = msysKind;
	}
	public String getMsysName() {
		return msysName;
	}
	public void setMsysName(String msysName) {
		this.msysName = msysName;
	}
	public String getMsysValue() {
		return msysValue;
	}
	public void setMsysValue(String msysValue) {
		this.msysValue = msysValue;
	}
	public String getMsysLang() {
		return msysLang;
	}
	public void setMsysLang(String msysLang) {
		this.msysLang = msysLang;
	}
	public String getMsysStatus() {
		return msysStatus;
	}
	public void setMsysStatus(String msysStatus) {
		this.msysStatus = msysStatus;
	}
	public String getMsysDelete() {
		return msysDelete;
	}
	public void setMsysDelete(String msysDelete) {
		this.msysDelete = msysDelete;
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
