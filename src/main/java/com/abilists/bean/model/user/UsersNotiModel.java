package com.abilists.bean.model.user;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

/**
 * 0.0.2
 * TODO
 * Not used this version.
 * 
 * @author joonk
 *
 */
public class UsersNotiModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long unNo;
	private String userId;
	private long notiNo;
	private String unStatus;
	private String unDelete;
	private Date insertTime;
	private Date updateTime;

	public long getUnNo() {
		return unNo;
	}
	public void setUnNo(long unNo) {
		this.unNo = unNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getNotiNo() {
		return notiNo;
	}
	public void setNotiNo(long notiNo) {
		this.notiNo = notiNo;
	}
	public String getUnStatus() {
		return unStatus;
	}
	public void setUnStatus(String unStatus) {
		this.unStatus = unStatus;
	}
	public String getUnDelete() {
		return unDelete;
	}
	public void setUnDelete(String unDelete) {
		this.unDelete = unDelete;
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
