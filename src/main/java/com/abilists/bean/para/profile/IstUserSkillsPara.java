package com.abilists.bean.para.profile;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;

public class IstUserSkillsPara extends CommonPara {

	@NotNull(message="parameter.error.null.message")
	private String usSkill;

	@NotNull(message="parameter.error.null.message")
	private String msNo;

	private String usKind;

	private String usLevel;

	@ByteString(min=1, max=650, charset="UTF-8", message="parameter.error.size.max650.message") //700
	private String usDetail;

	public String getUsSkill() {
		return usSkill;
	}

	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
	}

	public String getMsNo() {
		return msNo;
	}

	public void setMsNo(String msNo) {
		this.msNo = msNo;
	}

	public String getUsKind() {
		return usKind;
	}

	public void setUsKind(String usKind) {
		this.usKind = usKind;
	}

	public String getUsLevel() {
		return usLevel;
	}

	public void setUsLevel(String usLevel) {
		this.usLevel = usLevel;
	}

	public String getUsDetail() {
		return usDetail;
	}

	public void setUsDetail(String usDetail) {
		this.usDetail = usDetail;
	}

}