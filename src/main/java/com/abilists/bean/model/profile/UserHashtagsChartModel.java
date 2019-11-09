package com.abilists.bean.model.profile;

import java.io.Serializable;

public class UserHashtagsChartModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String msKind;
	private int cnt;

	public String getMsKind() {
		return msKind;
	}
	public void setMsKind(String msKind) {
		this.msKind = msKind;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
