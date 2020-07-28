package com.abilists.bean.para.admin.users;

import io.utility.validate.annotation.IsInteger;

public class UdtMDepartmentPara extends IstMDepartmentPara {

	@IsInteger(message = "parameter.error.integer.message")
	private String mdtNo;

	public String getMdtNo() {
		return mdtNo;
	}

	public void setMdtNo(String mdtNo) {
		this.mdtNo = mdtNo;
	}

}
