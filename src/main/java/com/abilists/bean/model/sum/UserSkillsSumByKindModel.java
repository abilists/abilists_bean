package com.abilists.bean.model.sum;

import java.io.Serializable;

public class UserSkillsSumByKindModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String usSkill;
	private String usKind;
	private int sumLevel;

	public String getUsSkill() {
		return usSkill;
	}
	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
	}
	public String getUsKind() {
		return usKind;
	}
	public void setUsKind(String usKind) {
		this.usKind = usKind;
	}
	public int getSumLevel() {
		return sumLevel;
	}
	public void setSumLevel(int sumLevel) {
		this.sumLevel = sumLevel;
	}


	
}
