package com.abilists.bean.list;

import com.abilists.bean.model.list.MyListSumModel;
import com.abilists.bean.model.list.UserMyListModel;

public class MyListBean {

	private UserMyListModel userMyList;
	private MyListSumModel myListSum;

	public UserMyListModel getUserMyList() {
		return userMyList;
	}

	public void setUserMyList(UserMyListModel userMyList) {
		this.userMyList = userMyList;
	}

	public MyListSumModel getMyListSum() {
		return myListSum;
	}

	public void setMyListSum(MyListSumModel myListSum) {
		this.myListSum = myListSum;
	}

}
