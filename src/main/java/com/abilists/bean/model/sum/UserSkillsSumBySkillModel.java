package com.abilists.bean.model.sum;

import java.io.Serializable;

public class UserSkillsSumBySkillModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String usSkill;
	private int cntUsSkill;
	private int sumUsLevel;

	public String getUsSkill() {
		return usSkill;
	}
	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
	}
	public int getCntUsSkill() {
		return cntUsSkill;
	}
	public void setCntUsSkill(int cntUsSkill) {
		this.cntUsSkill = cntUsSkill;
	}
	public int getSumUsLevel() {
		return sumUsLevel;
	}
	public void setSumUsLevel(int sumUsLevel) {
		this.sumUsLevel = sumUsLevel;
	}

	
}
