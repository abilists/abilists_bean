package com.abilists.bean.model.master;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class MIndustryModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long miNo;
	private String miLargeCategory;
	private String miMiddleCategory;
	private String miImgCode;
	private String miCode;
	private String mlCode;
	private String miStatus;
	private String miDelete;
	private Date insertTime;
	private Date updateTime;

	public long getMiNo() {
		return miNo;
	}
	public void setMiNo(long miNo) {
		this.miNo = miNo;
	}
	public String getMiLargeCategory() {
		return miLargeCategory;
	}
	public void setMiLargeCategory(String miLargeCategory) {
		this.miLargeCategory = miLargeCategory;
	}
	public String getMiMiddleCategory() {
		return miMiddleCategory;
	}
	public void setMiMiddleCategory(String miMiddleCategory) {
		this.miMiddleCategory = miMiddleCategory;
	}
	public String getMiCode() {
		return miCode;
	}
	public void setMiCode(String miCode) {
		this.miCode = miCode;
	}
	public String getMiImgCode() {
		return miImgCode;
	}
	public void setMiImgCode(String miImgCode) {
		this.miImgCode = miImgCode;
	}
	public String getMlCode() {
		return mlCode;
	}
	public void setMlCode(String mlCode) {
		this.mlCode = mlCode;
	}
	public String getMiStatus() {
		return miStatus;
	}
	public void setMiStatus(String miStatus) {
		this.miStatus = miStatus;
	}
	public String getMiDelete() {
		return miDelete;
	}
	public void setMiDelete(String miDelete) {
		this.miDelete = miDelete;
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
