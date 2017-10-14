package com.abilists.bean.model.join;

import java.io.Serializable;

public class UserProjectsJoinMroleModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mrName;
	private int cnt;

	public String getMrName() {
		return mrName;
	}
	public void setMrName(String mrName) {
		this.mrName = mrName;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}