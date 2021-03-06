package com.abilists.bean.para.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.utility.validate.annotation.EscapeString;

public class UserIdPara {

    @NotNull(message = "userId")
    @EscapeString(message = "parameter.error.escape.character.message")
    @Size(min = 3, max = 20 ,message = "userId must not exceed {max} characters")
	private String userId;
    private String result;
    private String error;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
