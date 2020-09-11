package com.abilists.bean.admin.plugins;

import base.bean.BasicBean;

public class PartnerBean extends BasicBean {

	public static final String PARTNER_NO = "partnerNo";
	public static final String PARTNER_NAME = "partnerName";
	public static final String PARTNER_TELEPHONE = "partnerTelephone";
	public static final String PARTNER_EMAIL = "partnerEmail";
	public static final String PARTNER_COMPANY = "partnerCompany";
	public static final String PARTNER_DEPARTMENT = "partnerDepartment";
	public static final String PARTNER_STATUS = "partnerStatus";
	public static final String PARTNER_DELETE = "partnerDelete";
	public static final String SERVER_NAME = "serverName";

	private int partnerNo;
	private String partnerName;
	private String partnerTelephone;
	private String partnerEmail;
	private String partnerCompany;
	private String partnerDepartment;
	private String partnerStatus;
	private String partnerDelete;
	private String serverName;
	private String insertTime;
	private String updateTime;

	public int getPartnerNo() {
		return partnerNo;
	}
	public void setPartnerNo(int partnerNo) {
		this.partnerNo = partnerNo;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getPartnerTelephone() {
		return partnerTelephone;
	}
	public void setPartnerTelephone(String partnerTelephone) {
		this.partnerTelephone = partnerTelephone;
	}
	public String getPartnerEmail() {
		return partnerEmail;
	}
	public void setPartnerEmail(String partnerEmail) {
		this.partnerEmail = partnerEmail;
	}
	public String getPartnerCompany() {
		return partnerCompany;
	}
	public void setPartnerCompany(String partnerCompany) {
		this.partnerCompany = partnerCompany;
	}
	public String getPartnerDepartment() {
		return partnerDepartment;
	}
	public void setPartnerDepartment(String partnerDepartment) {
		this.partnerDepartment = partnerDepartment;
	}
	public String getPartnerStatus() {
		return partnerStatus;
	}
	public void setPartnerStatus(String partnerStatus) {
		this.partnerStatus = partnerStatus;
	}
	public String getPartnerDelete() {
		return partnerDelete;
	}
	public void setPartnerDelete(String partnerDelete) {
		this.partnerDelete = partnerDelete;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
