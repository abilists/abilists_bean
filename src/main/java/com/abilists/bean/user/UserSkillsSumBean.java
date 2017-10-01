package com.abilists.bean.user;

import java.util.Map;

public class UserSkillsSumBean {

	private String usSkill;
	private String bgColor;
	private Map<String, Integer> skillsMap;

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

	public Map<String, Integer> getSkillsMap() {
		return skillsMap;
	}

	public void setSkillsMap(Map<String, Integer> skillsMap) {
		this.skillsMap = skillsMap;
	}

}
