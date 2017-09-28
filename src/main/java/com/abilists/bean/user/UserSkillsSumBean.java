package com.abilists.bean.user;

import java.util.HashMap;

public class UserSkillsSumBean {

	private String year;
	private String usSkill;
	private String bgColor;
	private HashMap<String, Integer> skillsMap;

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

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public HashMap<String, Integer> getSkillsMap() {
		return skillsMap;
	}

	public void setSkillsMap(HashMap<String, Integer> skillsMap) {
		this.skillsMap = skillsMap;
	}

}
