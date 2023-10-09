package com.abilists.bean.model.sum;

import java.io.Serializable;

public class UserMemoSumByMonthModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String months;
	private int cnt;

	public String getMonths() {
		return months;
	}
	public void setMonths(String months) {
		this.months = months;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
