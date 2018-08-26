package com.abilists.bean.model.sum;

import java.io.Serializable;

public class UserFilesSumByKindModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ufKind;
	private int cnt;

	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getUfKind() {
		return ufKind;
	}
	public void setUfKind(String ufKind) {
		this.ufKind = ufKind;
	}

}
