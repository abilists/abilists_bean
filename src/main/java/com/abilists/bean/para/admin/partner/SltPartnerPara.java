package com.abilists.bean.para.admin.partner;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;

public class SltPartnerPara extends CommonPara {

	// @NotNull(message = "parameter.error.null.message")
	private String partnerId;

	private String companyNo;

	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

}
