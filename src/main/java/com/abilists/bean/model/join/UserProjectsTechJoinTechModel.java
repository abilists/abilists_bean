package com.abilists.bean.model.join;

import java.io.Serializable;

public class UserProjectsTechJoinTechModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String msName;
	private int cntMsNo;

	public String getMsName() {
		return msName;
	}
	public void setMsName(String msName) {
		this.msName = msName;
	}
	public int getCntMsNo() {
		return cntMsNo;
	}
	public void setCntMsNo(int cntMsNo) {
		this.cntMsNo = cntMsNo;
	}

}