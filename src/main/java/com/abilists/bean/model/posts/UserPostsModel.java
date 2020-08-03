package com.abilists.bean.model.posts;

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
	private String upsFileName;
	private String upsFilePath;
	private String upsStatus;
	private String upsDelete;
	private String userId;
	private String userName;
	private long mcpNo;
	private String mcpDomain;
	private long mdtNo;
	private Date insertTime;
	private Date updateTime;

	UserPostsModel(){
	}

	public UserPostsModel(UserPostsModel userPosts){
		this.upsNo = userPosts.getUpsNo();
		this.upsServiceNo = userPosts.getUpsServiceNo();
		this.upsServiceName = userPosts.getUpsServiceName();
		this.upsTitle = userPosts.getUpsTitle();
		this.upsPost = userPosts.getUpsPost();
		this.upsFileName = userPosts.getUpsFileName();
		this.upsFilePath = userPosts.getUpsFilePath();
		this.upsStatus = userPosts.getUpsStatus();
		this.upsDelete = userPosts.getUpsDelete();
		this.userId = userPosts.getUserId();
		this.userName = userPosts.getUserName();
		this.mcpNo = userPosts.getMcpNo();
		this.mcpDomain = userPosts.getMcpDomain();
		this.mdtNo = userPosts.getMdtNo();
		this.insertTime = userPosts.getInsertTime();
		this.updateTime = userPosts.getUpdateTime();
		this.setUserImgAvatar(userPosts.getUserImgAvatar());
		this.setToken(userPosts.getToken());
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
	public long getMcpNo() {
		return mcpNo;
	}

	public void setMcpNo(long mcpNo) {
		this.mcpNo = mcpNo;
	}

	public String getMcpDomain() {
		return mcpDomain;
	}

	public void setMcpDomain(String mcpDomain) {
		this.mcpDomain = mcpDomain;
	}

	public long getMdtNo() {
		return mdtNo;
	}

	public void setMdtNo(long mdtNo) {
		this.mdtNo = mdtNo;
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
