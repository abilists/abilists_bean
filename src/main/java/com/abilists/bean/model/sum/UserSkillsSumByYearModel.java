package com.abilists.bean.model.sum;

import java.io.Serializable;

public class UserSkillsSumByYearModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String year;
	private String usSkill;
	private int usLevelSum;

	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getUsSkill() {
		return usSkill;
	}
	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
	}
	public int getUsLevelSum() {
		return usLevelSum;
	}
	public void setUsLevelSum(int usLevelSum) {
		this.usLevelSum = usLevelSum;
	}


}
