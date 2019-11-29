package com.abilists.bean.model.posts;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserUbPostsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long upsNo;
	private long upsServiceNo;
	private String upsServiceName;
	private String upsTitle;
	private String upsPost;
	private String upsFileName;
	private String upsFilePath;
	private String upsStatus;
	private String upsDelete;
	private String userId;
	private String userName;
	private Date insertTime;
	private Date updateTime;

	private String ubStatus;

	UserUbPostsModel(){
	}

	public UserUbPostsModel(UserUbPostsModel userUbPosts){
		this.upsNo = userUbPosts.getUpsNo();
		this.upsServiceNo = userUbPosts.getUpsServiceNo();
		this.upsServiceName = userUbPosts.getUpsServiceName();
		this.upsTitle = userUbPosts.getUpsTitle();
		this.upsPost = userUbPosts.getUpsPost();
		this.upsFileName = userUbPosts.getUpsFileName();
		this.upsFilePath = userUbPosts.getUpsFilePath();
		this.upsStatus = userUbPosts.getUpsStatus();
		this.upsDelete = userUbPosts.getUpsDelete();
		this.userId = userUbPosts.getUserId();
		this.userName = userUbPosts.getUserName();
		this.insertTime = userUbPosts.getInsertTime();
		this.updateTime = userUbPosts.getUpdateTime();

		this.ubStatus = userUbPosts.getUbStatus();
		this.setUserImgAvatar(userUbPosts.getUserImgAvatar());
		this.setToken(userUbPosts.getToken());
	}

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
	public String getUpsFileName() {
		return upsFileName;
	}
	public void setUpsFileName(String upsFileName) {
		this.upsFileName = upsFileName;
	}
	public String getUpsFilePath() {
		return upsFilePath;
	}
	public void setUpsFilePath(String upsFilePath) {
		this.upsFilePath = upsFilePath;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getUbStatus() {
		return ubStatus;
	}
	public void setUbStatus(String ubStatus) {
		this.ubStatus = ubStatus;
	}

}
