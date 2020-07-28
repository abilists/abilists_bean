package com.abilists.bean.para.admin.users;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;

public class IstMCompanyPara extends CommonPara {

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=50, charset="UTF-8", message="parameter.error.size.max50.message") // 50
	private String mcpDomain;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=200, charset="UTF-8", message="parameter.error.size.max200.message") // 200
	private String mcpName;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=100, charset="UTF-8", message="parameter.error.size.max100.message") // 100
	private String mcpLogo;

    private String mcpEmployeeSize;

    @CharacterEscape(message = "parameter.error.escape.character.message")
	private String mcpType;

    @ByteString(min=1, max=100, charset="UTF-8", message="parameter.error.size.max100.message") // 100
	private String mcpHeadquarter;

    @ByteString(min=1, max=100, charset="UTF-8", message="parameter.error.size.max100.message") // 100
	private String mcpRegion;

	private String mcpFoundationDate;

	@ByteString(min=1, max=100, charset="UTF-8", message="parameter.error.size.max100.message") // 100
    private String mcpUrl;

	public String getMcpDomain() {
		return mcpDomain;
	}

	public void setMcpDomain(String mcpDomain) {
		this.mcpDomain = mcpDomain;
	}

	public String getMcpName() {
		return mcpName;
	}

	public void setMcpName(String mcpName) {
		this.mcpName = mcpName;
	}

	public String getMcpLogo() {
		return mcpLogo;
	}

	public void setMcpLogo(String mcpLogo) {
		this.mcpLogo = mcpLogo;
	}

	public String getMcpEmployeeSize() {
		return mcpEmployeeSize;
	}

	public void setMcpEmployeeSize(String mcpEmployeeSize) {
		this.mcpEmployeeSize = mcpEmployeeSize;
	}

	public String getMcpType() {
		return mcpType;
	}

	public void setMcpType(String mcpType) {
		this.mcpType = mcpType;
	}

	public String getMcpHeadquarter() {
		return mcpHeadquarter;
	}

	public void setMcpHeadquarter(String mcpHeadquarter) {
		this.mcpHeadquarter = mcpHeadquarter;
	}

	public String getMcpRegion() {
		return mcpRegion;
	}

	public void setMcpRegion(String mcpRegion) {
		this.mcpRegion = mcpRegion;
	}

	public String getMcpFoundationDate() {
		return mcpFoundationDate;
	}

	public void setMcpFoundationDate(String mcpFoundationDate) {
		this.mcpFoundationDate = mcpFoundationDate;
	}

	public String getMcpUrl() {
		return mcpUrl;
	}

	public void setMcpUrl(String mcpUrl) {
		this.mcpUrl = mcpUrl;
	}

}