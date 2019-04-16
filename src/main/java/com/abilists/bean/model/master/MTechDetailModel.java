package com.abilists.bean.model.master;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class MTechDetailModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int mtdNo;
	private int msNo;
	private String msKind;
	private int mtdLevel;
	private String mtdLevelExplain;
	private String mlCode;
	private String mtdStatus;
	private String mtdDelete;
	private Date insertTime;
	private Date updateTime;

	public int getMtdNo() {
		return mtdNo;
	}
	public void setMtdNo(int mtdNo) {
		this.mtdNo = mtdNo;
	}
	public int getMsNo() {
		return msNo;
	}
	public void setMsNo(int msNo) {
		this.msNo = msNo;
	}
	public String getMsKind() {
		return msKind;
	}
	public void setMsKind(String msKind) {
		this.msKind = msKind;
	}
	public int getMtdLevel() {
		return mtdLevel;
	}
	public void setMtdLevel(int mtdLevel) {
		this.mtdLevel = mtdLevel;
	}
	public String getMtdLevelExplain() {
		return mtdLevelExplain;
	}
	public void setMtdLevelExplain(String mtdLevelExplain) {
		this.mtdLevelExplain = mtdLevelExplain;
	}
	public String getMlCode() {
		return mlCode;
	}
	public void setMlCode(String mlCode) {
		this.mlCode = mlCode;
	}
	public String getMtdStatus() {
		return mtdStatus;
	}
	public void setMtdStatus(String mtdStatus) {
		this.mtdStatus = mtdStatus;
	}
	public String getMtdDelete() {
		return mtdDelete;
	}
	public void setMtdDelete(String mtdDelete) {
		this.mtdDelete = mtdDelete;
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
