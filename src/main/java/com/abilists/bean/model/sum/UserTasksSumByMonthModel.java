package com.abilists.bean.model.sum;

import java.io.Serializable;

public class UserTasksSumByMonthModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String months;
	private String utStatus;
	private int cnt;

	public String getMonths() {
		return months;
	}
	public void setMonths(String months) {
		this.months = months;
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
