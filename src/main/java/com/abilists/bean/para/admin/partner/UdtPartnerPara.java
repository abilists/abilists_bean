package com.abilists.bean.para.admin.partner;

import org.hibernate.validator.constraints.Email;

import base.bean.para.CommonPara;

public class UdtPartnerPara extends CommonPara {

	private String partnerNo;

	private String partnerId;

	private String partnerPwd;

	private String partnerAuth;

	private String partnerFirstName;

	private String partnerLastName;

	private String partnerName;

	@Email(message = "login.signup.email.text1")
	private String partnerEmail;

	private String companyNo;

	public String getPartnerNo() {
		return partnerNo;
	}
	public void setPartnerNo(String partnerNo) {
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
	public String getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

}
