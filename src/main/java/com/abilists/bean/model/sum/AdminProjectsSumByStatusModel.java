package com.abilists.bean.model.sum;

import java.io.Serializable;

public class AdminProjectsSumByStatusModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int cnt;
	private String upStatus;

	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getUpStatus() {
		return upStatus;
	}
	public void setUpStatus(String upStatus) {
		this.upStatus = upStatus;
	}

}
