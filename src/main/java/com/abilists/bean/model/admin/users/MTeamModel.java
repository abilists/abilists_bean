package com.abilists.bean.model.admin.users;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class MTeamModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long mtmNo;
	private String mtmUserId;
	private String mtmUserName;
	private String mtmStatus;
	private String mtmDelete;
	private String adminId;
	private Date insertTime;
	private Date updateTime;

	public long getMtmNo() {
		return mtmNo;
	}
	public void setMtmNo(long mtmNo) {
		this.mtmNo = mtmNo;
	}
	public String getMtmUserId() {
		return mtmUserId;
	}
	public void setMtmUserId(String mtmUserId) {
		this.mtmUserId = mtmUserId;
	}
	public String getMtmUserName() {
		return mtmUserName;
	}
	public void setMtmUserName(String mtmUserName) {
		this.mtmUserName = mtmUserName;
	}
	public String getMtmStatus() {
		return mtmStatus;
	}
	public void setMtmStatus(String mtmStatus) {
		this.mtmStatus = mtmStatus;
	}
	public String getMtmDelete() {
		return mtmDelete;
	}
	public void setMtmDelete(String mtmDelete) {
		this.mtmDelete = mtmDelete;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
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
