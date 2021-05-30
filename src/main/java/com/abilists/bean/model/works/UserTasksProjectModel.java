package com.abilists.bean.model.works;

import java.io.Serializable;

public class UserTasksProjectModel extends UserTasksModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String upName;

	public String getUpName() {
		return upName;
	}
	public void setUpName(String upName) {
		this.upName = upName;
	}

}
