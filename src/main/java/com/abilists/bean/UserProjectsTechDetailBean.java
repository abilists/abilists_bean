package com.abilists.bean;

import java.util.List;

import com.abilists.bean.model.master.MTechDetailModel;
import com.abilists.bean.model.works.UserProjectTechModel;

public class UserProjectsTechDetailBean {

	private UserProjectTechModel userProjectTech;

	private List<MTechDetailModel> mTechDetailList;

	public UserProjectTechModel getUserProjectTech() {
		return userProjectTech;
	}

	public void setUserProjectTech(UserProjectTechModel userProjectTech) {
		this.userProjectTech = userProjectTech;
	}

	public List<MTechDetailModel> getmTechDetailList() {
		return mTechDetailList;
	}

	public void setmTechDetailList(List<MTechDetailModel> mTechDetailList) {
		this.mTechDetailList = mTechDetailList;
	}

}
