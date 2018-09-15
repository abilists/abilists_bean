package com.abilists.bean.model.sum;

import java.io.Serializable;

public class UserTasksSumByMonthModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String month;
	private String utStatus;
	private int cnt;

	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getUtStatus() {
		return utStatus;
	}
	public void setUtStatus(String utStatus) {
		this.utStatus = utStatus;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
