package com.abilists.bean.para.works;

import java.util.ArrayList;
import java.util.List;

import com.abilists.bean.model.works.UserMemoModel;

public class MemoListAjax {

	List<UserMemoModel> userMemoList = new ArrayList<UserMemoModel>();

	public List<UserMemoModel> getUserMemoList() {
		return userMemoList;
	}

	public void setUserMemoList(List<UserMemoModel> userMemoList) {
		this.userMemoList = userMemoList;
	}

}
