package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;

public class UdtProjectTechPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
    private String msNo;

	private String upNo;

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String uptNo;

	private String uptKind;

    private String uptLevel;

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@NotNull(message = "parameter.error.null.message")
	@ByteString(charset = "UTF-8", min = 1, max = 650, message = "parameter.error.size.max650.message") // 700
    private String uptDetail;

	private String uptStatus;

	public String getMsNo() {
		return msNo;
	}

	public void setMsNo(String msNo) {
		this.msNo = msNo;
	}

	public String getUpNo() {
		return upNo;
	}

	public void setUpNo(String upNo) {
		this.upNo = upNo;
	}

	public String getUptNo() {
		return uptNo;
	}

	public void setUptNo(String uptNo) {
		this.uptNo = uptNo;
	}

	public String getUptKind() {
		return uptKind;
	}

	public void setUptKind(String uptKind) {
		this.uptKind = uptKind;
	}

	public String getUptLevel() {
		return uptLevel;
	}

	public void setUptLevel(String uptLevel) {
		this.uptLevel = uptLevel;
	}

	public String getUptDetail() {
		return uptDetail;
	}

	public void setUptDetail(String uptDetail) {
		this.uptDetail = uptDetail;
	}

	public String getUptStatus() {
		return uptStatus;
	}

	public void setUptStatus(String uptStatus) {
		this.uptStatus = uptStatus;
	}
	
}