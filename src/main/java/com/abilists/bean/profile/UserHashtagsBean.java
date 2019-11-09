package com.abilists.bean.profile;

import java.io.Serializable;

import com.abilists.bean.model.profile.UserHashtagsModel;

public class UserHashtagsBean extends UserHashtagsModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String msExplain;

	public String getMsExplain() {
		return msExplain;
	}

	public void setMsExplain(String msExplain) {
		this.msExplain = msExplain;
	}

}
