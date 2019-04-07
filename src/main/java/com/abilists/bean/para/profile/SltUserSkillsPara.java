package com.abilists.bean.para.profile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class SltUserSkillsPara extends CommonPara {

	@NotNull(message = "usNo")
	@Size(min = 1, max = 90, message = "usNo must not exceed {max} characters")
	private String usNo;
	private String usSkill;
	private String usLevel;
	private String usDetail;
	private String usStatus;

	public String getUsNo() {
		return usNo;
	}
	public void setUsNo(String usNo) {
		this.usNo = usNo;
	}
	public String getUsSkill() {
		return usSkill;
	}
	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
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
	public String getUsStatus() {
		return usStatus;
	}
	public void setUsStatus(String usStatus) {
		this.usStatus = usStatus;
	}

}