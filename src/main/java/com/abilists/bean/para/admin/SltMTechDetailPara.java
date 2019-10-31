package com.abilists.bean.para.admin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class SltMTechDetailPara extends CommonPara {

	private String mtdNo;

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String msNo;
	private String msKind;
	private String mtdLevel;
	private String mtdLevelExplain;
	private String mlCode;
	private String mtdStatus;
	private String mtdDelete;

	public String getMtdNo() {
		return mtdNo;
	}
	public void setMtdNo(String mtdNo) {
		this.mtdNo = mtdNo;
	}
	public String getMsNo() {
		return msNo;
	}
	public void setMsNo(String msNo) {
		this.msNo = msNo;
	}
	public String getMsKind() {
		return msKind;
	}
	public void setMsKind(String msKind) {
		this.msKind = msKind;
	}
	public String getMtdLevel() {
		return mtdLevel;
	}
	public void setMtdLevel(String mtdLevel) {
		this.mtdLevel = mtdLevel;
	}
	public String getMtdLevelExplain() {
		return mtdLevelExplain;
	}
	public void setMtdLevelExplain(String mtdLevelExplain) {
		this.mtdLevelExplain = mtdLevelExplain;
	}
	public String getMlCode() {
		return mlCode;
	}
	public void setMlCode(String mlCode) {
		this.mlCode = mlCode;
	}
	public String getMtdStatus() {
		return mtdStatus;
	}
	public void setMtdStatus(String mtdStatus) {
		this.mtdStatus = mtdStatus;
	}
	public String getMtdDelete() {
		return mtdDelete;
	}
	public void setMtdDelete(String mtdDelete) {
		this.mtdDelete = mtdDelete;
	}

}