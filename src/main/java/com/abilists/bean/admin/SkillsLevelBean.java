package com.abilists.bean.admin;

import java.util.List;

import com.abilists.bean.model.admin.join.MTechJoinUserSkillsLevelModel;

public class SkillsLevelBean {

	private List<MTechJoinUserSkillsLevelModel> mTechJoinUserSkillsLevelList;
	private int skillLevel;

	public List<MTechJoinUserSkillsLevelModel> getmTechJoinUserSkillsLevelList() {
		return mTechJoinUserSkillsLevelList;
	}
	public void setmTechJoinUserSkillsLevelList(List<MTechJoinUserSkillsLevelModel> mTechJoinUserSkillsLevelList) {
		this.mTechJoinUserSkillsLevelList = mTechJoinUserSkillsLevelList;
	}
	public int getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

}