package com.abilists.bean.model.join;

import java.io.Serializable;

public class MTechJoinUserSkillsModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int mtNo;
	private String mtSkill;
	private String mtName;
	private String usKind;
	private String usLevel;

	public int getMtNo() {
		return mtNo;
	}

	public void setMtNo(int mtNo) {
		this.mtNo = mtNo;
	}

	public String getMtSkill() {
		return mtSkill;
	}

	public void setMtSkill(String mtSkill) {
		this.mtSkill = mtSkill;
	}

	public String getMtName() {
		return mtName;
	}

	public void setMtName(String mtName) {
		this.mtName = mtName;
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


}