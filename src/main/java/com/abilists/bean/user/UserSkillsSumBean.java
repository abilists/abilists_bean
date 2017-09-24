package com.abilists.bean.user;

import java.util.HashMap;

public class UserSkillsSumBean {

	private String labels;
	private String year;
	private HashMap<String, Integer> skillsMap;

	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public HashMap<String, Integer> getSkillsMap() {
		return skillsMap;
	}

	public void setSkillsMap(HashMap<String, Integer> skillsMap) {
		this.skillsMap = skillsMap;
	}


}
