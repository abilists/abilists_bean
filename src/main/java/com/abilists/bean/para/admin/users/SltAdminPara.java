package com.abilists.bean.para.admin.users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;
import io.utility.validate.annotation.IsInteger;

public class SltAdminPara extends CommonPara {

	private String adminNo;

	@NotNull(message = "parameter.error.message")
	@CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 100 ,message = "parameter.error.size.max100.message")
	private String adminId;

	@IsInteger(message = "parameter.error.integer.message")
	private String mcpNo;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=50, charset="UTF-8", message="parameter.error.size.max50.message") // 50
	private String mcpDomain;

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
