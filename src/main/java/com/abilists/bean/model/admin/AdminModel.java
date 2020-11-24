package com.abilists.bean.model.admin;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class AdminModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int adminNo;
	private String adminId;
	private String adminName;
	private String adminPwd;
	private int adminAuth;
	private String adminStatus;
	private String adminDelete;
	private String userId;
	private long mcpNo;
	private String mcpDomain;
	private long mdtNo;
	private Date insertTime;
	private Date updateTime;
	
	private String mcName;
	private String mcValue;

	public int getAdminNo() {
		return adminNo;
	}
	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	public int getAdminAuth() {
		return adminAuth;
	}
	public void setAdminAuth(int adminAuth) {
		this.adminAuth = adminAuth;
	}
	public String getAdminStatus() {
		return adminStatus;
	}
	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}
	public String getAdminDelete() {
		return adminDelete;
	}
	public void setAdminDelete(String adminDelete) {
		this.adminDelete = adminDelete;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getMcName() {
		return mcName;
	}
	public void setMcName(String mcName) {
		this.mcName = mcName;
	}
	public String getMcValue() {
		return mcValue;
	}
	public void setMcValue(String mcValue) {
		this.mcValue = mcValue;
	}

}