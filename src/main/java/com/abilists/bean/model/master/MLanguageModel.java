package com.abilists.bean.model.master;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class MLanguageModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long mlNo;
	private String mlCode;
	private String mlName;
	private String mlEnglishName;
	private String mlStatus;
	private String mlDelete;
	private Date insertTime;
	private Date updateTime;

	public long getMlNo() {
		return mlNo;
	}
	public void setMlNo(long mlNo) {
		this.mlNo = mlNo;
	}
	public String getMlCode() {
		return mlCode;
	}
	public void setMlCode(String mlCode) {
		this.mlCode = mlCode;
	}
	public String getMlName() {
		return mlName;
	}
	public void setMlName(String mlName) {
		this.mlName = mlName;
	}
	public String getMlEnglishName() {
		return mlEnglishName;
	}
	public void setMlEnglishName(String mlEnglishName) {
		this.mlEnglishName = mlEnglishName;
	}
	public String getMlStatus() {
		return mlStatus;
	}
	public void setMlStatus(String mlStatus) {
		this.mlStatus = mlStatus;
	}
	public String getMlDelete() {
		return mlDelete;
	}
	public void setMlDelete(String mlDelete) {
		this.mlDelete = mlDelete;
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
