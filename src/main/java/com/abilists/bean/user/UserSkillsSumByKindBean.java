package com.abilists.bean.user;

import java.util.HashMap;

public class UserSkillsSumByKindBean {

	private String usSkill;
	private HashMap<String, Integer> skillsMap;

	public String getUsSkill() {
		return usSkill;
	}

	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
	}

	public HashMap<String, Integer> getSkillsMap() {
		return skillsMap;
	}

	public void setSkillsMap(HashMap<String, Integer> skillsMap) {
		this.skillsMap = skillsMap;
	}


}
