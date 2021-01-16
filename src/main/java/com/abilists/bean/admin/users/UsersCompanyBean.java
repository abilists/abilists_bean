package com.abilists.bean.admin.users;

import java.util.List;

import com.abilists.bean.model.account.UsersModel;
import com.abilists.bean.model.admin.users.MCompanyDeptModel;
import com.abilists.bean.model.admin.users.MDepartmentModel;
import com.abilists.bean.model.works.UserFilesModel;

public class UsersCompanyBean {

	private UsersModel users;
	private UserFilesModel userResume;
	private List<MDepartmentModel> mDepartmentList;
	private MCompanyDeptModel mCompanyDept;
	private List<MCompanyDeptModel> mCompanyDeptList;

	public UsersModel getUsers() {
		return users;
	}

	public void setUsers(UsersModel users) {
		this.users = users;
	}

	public UserFilesModel getUserResume() {
		return userResume;
	}

	public void setUserResume(UserFilesModel userResume) {
		this.userResume = userResume;
	}

	public List<MDepartmentModel> getmDepartmentList() {
		return mDepartmentList;
	}

	public void setmDepartmentList(List<MDepartmentModel> mDepartmentList) {
		this.mDepartmentList = mDepartmentList;
	}
	
	public MCompanyDeptModel getmCompanyDept() {
		return mCompanyDept;
	}

	public void setmCompanyDept(MCompanyDeptModel mCompanyDept) {
		this.mCompanyDept = mCompanyDept;
	}

	public List<MCompanyDeptModel> getmCompanyDeptList() {
		return mCompanyDeptList;
	}

	public void setmCompanyDeptList(List<MCompanyDeptModel> mCompanyDeptList) {
		this.mCompanyDeptList = mCompanyDeptList;
	}

}
