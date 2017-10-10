package com.abilists.bean.model.user;

import java.io.Serializable;
import java.util.Date;

import com.abilists.bean.model.BasicModel;

public class UserProjectTechModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int uptNo;
	private String uptKind;
	private int uptLevel;
	private String uptDetail;
	private String uptStatus;
	private String uptDelete;
	private Date insertTime;
	private Date updateTime;
	private int mtNo;
	private int upNo;
	private String userId;

	public int getUptNo() {
		return uptNo;
	}
	public void setUptNo(int uptNo) {
		this.uptNo = uptNo;
	}
	public String getUptKind() {
		return uptKind;
	}
	public void setUptKind(String uptKind) {
		this.uptKind = uptKind;
	}
	public int getUptLevel() {
		return uptLevel;
	}
	public void setUptLevel(int uptLevel) {
		this.uptLevel = uptLevel;
	}
	public String getUptDetail() {
		return uptDetail;
	}
	public void setUptDetail(String uptDetail) {
		this.uptDetail = uptDetail;
	}
	public String getUptStatus() {
		return uptStatus;
	}
	public void setUptStatus(String uptStatus) {
		this.uptStatus = uptStatus;
	}
	public String getUptDelete() {
		return uptDelete;
	}
	public void setUptDelete(String uptDelete) {
		this.uptDelete = uptDelete;
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
	public int getMtNo() {
		return mtNo;
	}
	public void setMtNo(int mtNo) {
		this.mtNo = mtNo;
	}
	public int getUpNo() {
		return upNo;
	}
	public void setUpNo(int upNo) {
		this.upNo = upNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}


}
