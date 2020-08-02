package com.abilists.bean.model.account;

import java.io.Serializable;

public class UsersInfoModel extends UsersModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mcpName;
	private String mdtName;

	public String getMcpName() {
		return mcpName;
	}
	public void setMcpName(String mcpName) {
		this.mcpName = mcpName;
	}
	public String getMdtName() {
		return mdtName;
	}
	public void setMdtName(String mdtName) {
		this.mdtName = mdtName;
	}

}
