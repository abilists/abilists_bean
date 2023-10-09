package com.abilists.bean.model.sum;

import java.io.Serializable;

public class UserSkillsSumByYearModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String usSkill;
	private String years;
	private int usLevelSum;

	public String getUsSkill() {
		return usSkill;
	}
	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public int getUsLevelSum() {
		return usLevelSum;
	}
	public void setUsLevelSum(int usLevelSum) {
		this.usLevelSum = usLevelSum;
	}


}
