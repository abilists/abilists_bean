package com.abilists.bean.para.admin.users;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;
import io.utility.validate.annotation.IsInteger;

public class SltMDepartmentPara extends CommonPara {

	@IsInteger(message = "parameter.error.integer.message")
	private String mdtNo;

	@IsInteger(message = "parameter.error.integer.message")
	private String mcpNo;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=50, charset="UTF-8", message="parameter.error.size.max50.message") // 50
	private String mcpDomain;

	public String getMdtNo() {
		return mdtNo;
	}

	public void setMdtNo(String mdtNo) {
		this.mdtNo = mdtNo;
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

}
