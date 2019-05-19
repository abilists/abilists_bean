package com.abilists.bean.para.memo;

import java.util.ArrayList;
import java.util.List;

import com.abilists.bean.model.works.UserMemoModel;

public class MemoListAjax {

	List<UserMemoModel> userMemoList = new ArrayList<UserMemoModel>();
	String value = null;

	public List<UserMemoModel> getUserMemoList() {
		return userMemoList;
	}

	public void setUserMemoList(List<UserMemoModel> userMemoList) {
		this.userMemoList = userMemoList;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
