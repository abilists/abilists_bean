package com.abilists.bean.model.admin.works;

import java.io.Serializable;

import com.abilists.bean.model.works.UserMemoModel;

public class UserMemoOptionsModel extends UserMemoModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String uoOption;
	private String uoValue;

	public String getUoOption() {
		return uoOption;
	}
	public void setUoOption(String uoOption) {
		this.uoOption = uoOption;
	}
	public String getUoValue() {
		return uoValue;
	}
	public void setUoValue(String uoValue) {
		this.uoValue = uoValue;
	}

}
