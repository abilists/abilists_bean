package com.abilists.bean.model.sum;

import java.io.Serializable;

public class UserMemoSumByMonthModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String month;
	private int cnt;

	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
