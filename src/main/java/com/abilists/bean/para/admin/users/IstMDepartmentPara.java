package com.abilists.bean.para.admin.users;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;
import io.utility.validate.annotation.IsInteger;

public class IstMDepartmentPara extends CommonPara {

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=200, charset="UTF-8", message="parameter.error.size.max200.message") // 200
	private String mdtName;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=200, charset="UTF-8", message="parameter.error.size.max200.message") // 200
	private String mdtCode;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=100, charset="UTF-8", message="parameter.error.size.max100.message") // 100
	private String mdtUrl;

    @CharacterEscape(message = "parameter.error.escape.character.message")
	private String mdtImg;

    @ByteString(min=1, max=100, charset="UTF-8", message="parameter.error.size.max100.message") // 100
	private String mdtExplain;

    @ByteString(min=1, max=100, charset="UTF-8", message="parameter.error.size.max100.message") // 100
	private String mdtStatus;

	private String mdtDelete;

	@IsInteger(message = "parameter.error.integer.message")
	private String mcpNo;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(min=1, max=50, charset="UTF-8", message="parameter.error.size.max50.message") // 50
	private String mcpDomain;

	public String getMdtName() {
		return mdtName;
	}

	public void setMdtName(String mdtName) {
		this.mdtName = mdtName;
	}

	public String getMdtCode() {
		return mdtCode;
	}

	public void setMdtCode(String mdtCode) {
		this.mdtCode = mdtCode;
	}

	public String getMdtUrl() {
		return mdtUrl;
	}

	public void setMdtUrl(String mdtUrl) {
		this.mdtUrl = mdtUrl;
	}

	public String getMdtImg() {
		return mdtImg;
	}

	public void setMdtImg(String mdtImg) {
		this.mdtImg = mdtImg;
	}

	public String getMdtExplain() {
		return mdtExplain;
	}

	public void setMdtExplain(String mdtExplain) {
		this.mdtExplain = mdtExplain;
	}

	public String getMdtStatus() {
		return mdtStatus;
	}

	public void setMdtStatus(String mdtStatus) {
		this.mdtStatus = mdtStatus;
	}

	public String getMdtDelete() {
		return mdtDelete;
	}

	public void setMdtDelete(String mdtDelete) {
		this.mdtDelete = mdtDelete;
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