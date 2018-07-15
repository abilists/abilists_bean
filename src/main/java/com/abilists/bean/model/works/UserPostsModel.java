package com.abilists.bean.model.works;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserPostsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long upsNo;
	private long upsServiceNo;
	private String upsServiceName;
	private String upsTitle;
	private String upsPost;
	private String upsStatus;
	private String upsDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public long getUpsNo() {
		return upsNo;
	}
	public void setUpsNo(long upsNo) {
		this.upsNo = upsNo;
	}
	public long getUpsServiceNo() {
		return upsServiceNo;
	}
	public void setUpsServiceNo(long upsServiceNo) {
		this.upsServiceNo = upsServiceNo;
	}
	public String getUpsServiceName() {
		return upsServiceName;
	}
	public void setUpsServiceName(String upsServiceName) {
		this.upsServiceName = upsServiceName;
	}
	public String getUpsTitle() {
		return upsTitle;
	}
	public void setUpsTitle(String upsTitle) {
		this.upsTitle = upsTitle;
	}
	public String getUpsPost() {
		return upsPost;
	}
	public void setUpsPost(String upsPost) {
		this.upsPost = upsPost;
	}
	public String getUpsStatus() {
		return upsStatus;
	}
	public void setUpsStatus(String upsStatus) {
		this.upsStatus = upsStatus;
	}
	public String getUpsDelete() {
		return upsDelete;
	}
	public void setUpsDelete(String upsDelete) {
		this.upsDelete = upsDelete;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
