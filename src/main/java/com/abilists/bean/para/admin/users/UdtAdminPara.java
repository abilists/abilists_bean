package com.abilists.bean.para.admin.users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.utility.validate.annotation.CharacterEscape;

public class UdtAdminPara extends IstMCompanyPara {

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String adminNo;

	@NotNull(message = "parameter.error.null.message")
	@CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 100 ,message = "parameter.error.size.max100.message")
	private String adminId;

	private String adminName;

    @NotNull(message = "parameter.error.null.message")
    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 150 ,message = "parameter.error.size.max150.message")
	private String adminPwd;
	private String adminAuth;
	private String adminStatus;
	private String adminDelete;
	private String userId;
	private String mcpNo;
	
	@CharacterEscape(message = "parameter.error.escape.character.message")
	private String mcpDomain;

	private String mdtNo;

	public String getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(String adminNo) {
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

	public String getAdminAuth() {
		return adminAuth;
	}

	public void setAdminAuth(String adminAuth) {
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

	public String getMcpNo() {
		return mcpNo;
	}

	public void setMcpNo(String mcpNo) {
		this.mcpNo = mcpNo;
	}

	public String getMcpDomain() {
		return mcpDomain;
	}

	public void setMcpDomain(String mcpDomain) {
		this.mcpDomain = mcpDomain;
	}

	public String getMdtNo() {
		return mdtNo;
	}

	public void setMdtNo(String mdtNo) {
		this.mdtNo = mdtNo;
	}

}
