package com.abilists.bean.model.join;

import java.io.Serializable;

public class UserProjectsJoinMindustryModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String miLargeCategory;
	private int cnt;

	public String getMiLargeCategory() {
		return miLargeCategory;
	}
	public void setMiLargeCategory(String miLargeCategory) {
		this.miLargeCategory = miLargeCategory;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}