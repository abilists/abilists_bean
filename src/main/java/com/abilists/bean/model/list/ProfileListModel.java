package com.abilists.bean.model.list;

import java.io.Serializable;

import com.abilists.bean.model.account.UsersModel;

public class ProfileListModel extends UsersModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int cnt;

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
