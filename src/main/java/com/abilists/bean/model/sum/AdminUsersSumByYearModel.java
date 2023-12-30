package com.abilists.bean.model.sum;

import java.io.Serializable;

public class AdminUsersSumByYearModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int cnt;
	private String years;

	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}

}
