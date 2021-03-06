package com.abilists.bean.para.profile;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;

public class UdtUserSkillsPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	private String usNo;

	@NotNull(message = "parameter.error.null.message")
	private String usSkill;

	@NotNull(message = "parameter.error.null.message")
	private String msNo;

	private String usKind;
	private String usLevel;

	@ByteString(min=1, max=650, charset="UTF-8", message="parameter.error.size.max650.message") // 700
	private String usDetail;
	private String req;
	private String cnt;

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
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}

}