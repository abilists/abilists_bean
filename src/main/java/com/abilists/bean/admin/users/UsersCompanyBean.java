package com.abilists.bean.admin.users;

import java.util.List;

import com.abilists.bean.model.account.UsersModel;
import com.abilists.bean.model.admin.users.MDepartmentModel;

public class UsersCompanyBean {

	private UsersModel users;
	
	private List<MDepartmentModel> mDepartmentList;

	public UsersModel getUsers() {
		return users;
	}

	public void setUsers(UsersModel users) {
		this.users = users;
	}

	public List<MDepartmentModel> getmDepartmentList() {
		return mDepartmentList;
	}

	public void setmDepartmentList(List<MDepartmentModel> mDepartmentList) {
		this.mDepartmentList = mDepartmentList;
	}

}
