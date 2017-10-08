package com.abilists.bean.model.join;

import java.io.Serializable;

public class UserProjectsTechJoinTechModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mtName;
	private String cntMtNo;

	public String getMtName() {
		return mtName;
	}
	public void setMtName(String mtName) {
		this.mtName = mtName;
	}
	public String getCntMtNo() {
		return cntMtNo;
	}
	public void setCntMtNo(String cntMtNo) {
		this.cntMtNo = cntMtNo;
	}

}