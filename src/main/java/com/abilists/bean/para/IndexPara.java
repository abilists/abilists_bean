package com.abilists.bean.para;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class IndexPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 100 ,message = "parameter.error.size.max100.message")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
