package com.abilists.bean.para.admin.partner;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;

public class IstPartnerPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	private String partnerId;

	@NotNull(message = "parameter.error.null.message")
	private String partnerPwd;

	private String partnerAuth;

	@NotNull(message = "parameter.error.null.message")
	private String partnerFirstName;

	@NotNull(message = "parameter.error.null.message")
	private String partnerLastName;

	@NotNull(message = "parameter.error.null.message")
	private String partnerName;

	@NotNull(message = "parameter.error.null.message")
	private String partnerEmail;

	private String companyNo;

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
