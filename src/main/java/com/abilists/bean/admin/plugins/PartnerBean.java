package com.abilists.bean.admin.plugins;

import base.bean.BasicBean;

public class PartnerBean extends BasicBean {

	public static final String PARTNER_NO = "partnerNo";
	public static final String PARTNER_ID = "partnerId";
	public static final String PARTNER_PWD = "partnerPwd";
	public static final String PARTNER_AUTH = "partnerAuth";
	public static final String PARTNER_FIRST_NAME = "partnerFirstName";
	public static final String PARTNER_LAST_NAME = "partnerLastName";
	public static final String PARTNER_NAME = "partnerName";
	public static final String PARTNER_EMAIL = "partnerEmail";
	public static final String PARTNER_STATUS = "partnerStatus";
	public static final String PARTNER_DELETE = "partnerDelete";
	public static final String COMPANY_NO = "companyNo";

	private int partnerNo;
	private String partnerId;
	private String partnerPwd;
	private String partnerAuth;
	private String partnerFirstName;
	private String partnerLastName;
	private String partnerName;
	private String partnerEmail;
	private String partnerStatus;
	private String partnerDelete;
	private String companyNo;
	private String insertTime;
	private String updateTime;

	public int getPartnerNo() {
		return partnerNo;
	}
	public void setPartnerNo(int partnerNo) {
		this.partnerNo = partnerNo;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerPwd() {
		return partnerPwd;
	}
	public void setPartnerPwd(String partnerPwd) {
		this.partnerPwd = partnerPwd;
	}
	public String getPartnerAuth() {
		return partnerAuth;
	}
	public void setPartnerAuth(String partnerAuth) {
		this.partnerAuth = partnerAuth;
	}
	public String getPartnerFirstName() {
		return partnerFirstName;
	}
	public void setPartnerFirstName(String partnerFirstName) {
		this.partnerFirstName = partnerFirstName;
	}
	public String getPartnerLastName() {
		return partnerLastName;
	}
	public void setPartnerLastName(String partnerLastName) {
		this.partnerLastName = partnerLastName;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getPartnerEmail() {
		return partnerEmail;
	}
	public void setPartnerEmail(String partnerEmail) {
		this.partnerEmail = partnerEmail;
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
	public String getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
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
