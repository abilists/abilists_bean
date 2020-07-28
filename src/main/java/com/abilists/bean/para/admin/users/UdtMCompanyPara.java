package com.abilists.bean.para.admin.users;

import io.utility.validate.annotation.IsInteger;

public class UdtMCompanyPara extends IstMCompanyPara {

	@IsInteger(message = "parameter.error.integer.message")
	private String mcpNo;

	public String getMcpNo() {
		return mcpNo;
	}

	public void setMcpNo(String mcpNo) {
		this.mcpNo = mcpNo;
	}

}
