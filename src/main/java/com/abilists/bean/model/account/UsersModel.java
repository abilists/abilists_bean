package com.abilists.bean.model.account;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UsersModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long userNo;
	private String userId;
	private String userAuth;
	private String userName;
	private String userLastName;
	private String userFirstName;
	private String userImgName;
	private byte[] userImg;
	private String userSex;
	private String userEmail;
	private String userAges;
	private String userProfile;
	private String userSummary;
	private String userStatus;
	private String userDelete;
	private long mdtNo;
	private long mcpNo;
	private String mcpDomain;
	private String userPwd;
	private Date insertTime;
	private Date updateTime;

	public long getUserNo() {
		return userNo;
	}
	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(String userAuth) {
		this.userAuth = userAuth;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAges() {
		return userAges;
	}
	public void setUserAges(String userAges) {
		this.userAges = userAges;
	}
	public String getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
	public String getUserSummary() {
		return userSummary;
	}
	public void setUserSummary(String userSummary) {
		this.userSummary = userSummary;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserDelete() {
		return userDelete;
	}
	public void setUserDelete(String userDelete) {
		this.userDelete = userDelete;
	}
	public long getMdtNo() {
		return mdtNo;
	}
	public void setMdtNo(long mdtNo) {
		this.mdtNo = mdtNo;
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
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
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
	public String getUserImgName() {
		return userImgName;
	}
	public void setUserImgName(String userImgName) {
		this.userImgName = userImgName;
	}
	public byte[] getUserImg() {
		return userImg;
	}
	public void setUserImg(byte[] userImg) {
		this.userImg = userImg;
	}

}
