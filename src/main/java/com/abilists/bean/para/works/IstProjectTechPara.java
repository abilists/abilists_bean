package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.Array;

public class IstProjectTechPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	@Array(message = "parameter.error.array.message")
    private String msNo;

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String upNo;

	private String uptKind;

    private String uptLevel;

    // TODO:
//	@NotNull(message = "parameter.error.null.message")
//	@Size(min = 1, max = 300 ,message = "parameter.error.size.max300.message")
//	@Array(message = "parameter.error.array.message")
    private String uptDetail;

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

}