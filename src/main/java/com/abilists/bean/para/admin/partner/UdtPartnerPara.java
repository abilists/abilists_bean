package com.abilists.bean.para.admin.partner;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.EscapeString;

public class UdtPartnerPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@EscapeString(message = "parameter.error.escape.character.message")
	private String serverName; // Only allow to input Alphabet and number

	private String partnerNo;

	private String partnerName;

	private String partnerTelephone;

	@Email(message = "login.signup.email.text1")
	private String partnerEmail;
	
	private String partnerCompany;

	private String partnerDepartment;

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getPartnerNo() {
		return partnerNo;
	}

	public void setPartnerNo(String partnerNo) {
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

}
