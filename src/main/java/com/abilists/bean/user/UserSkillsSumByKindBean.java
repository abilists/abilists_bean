package com.abilists.bean.user;

import java.util.Map;

public class UserSkillsSumByKindBean {

	private String usSkill;
	private Map<String, Integer> skillsMap;

	public String getUsSkill() {
		return usSkill;
	}

	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
	}

	public Map<String, Integer> getSkillsMap() {
		return skillsMap;
	}

	public void setSkillsMap(Map<String, Integer> skillsMap) {
		this.skillsMap = skillsMap;
	}

}
