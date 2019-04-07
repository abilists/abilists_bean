package com.abilists.bean.para.admin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class UdtMIndustryPara  extends CommonPara {

	private String miNo;

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String miLargeCategory;

	private String miMiddleCategory;
	private String miImgCode;
	private String miCode;

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String mlCode;

	private String miStatus;
	private String miDelete;

	public String getMiNo() {
		return miNo;
	}
	public void setMiNo(String miNo) {
		this.miNo = miNo;
	}
	public String getMiLargeCategory() {
		return miLargeCategory;
	}
	public void setMiLargeCategory(String miLargeCategory) {
		this.miLargeCategory = miLargeCategory;
	}
	public String getMiMiddleCategory() {
		return miMiddleCategory;
	}
	public void setMiMiddleCategory(String miMiddleCategory) {
		this.miMiddleCategory = miMiddleCategory;
	}
	public String getMiCode() {
		return miCode;
	}
	public void setMiCode(String miCode) {
		this.miCode = miCode;
	}
	public String getMiImgCode() {
		return miImgCode;
	}
	public void setMiImgCode(String miImgCode) {
		this.miImgCode = miImgCode;
	}
	public String getMlCode() {
		return mlCode;
	}
	public void setMlCode(String mlCode) {
		this.mlCode = mlCode;
	}
	public String getMiStatus() {
		return miStatus;
	}
	public void setMiStatus(String miStatus) {
		this.miStatus = miStatus;
	}
	public String getMiDelete() {
		return miDelete;
	}
	public void setMiDelete(String miDelete) {
		this.miDelete = miDelete;
	}

}