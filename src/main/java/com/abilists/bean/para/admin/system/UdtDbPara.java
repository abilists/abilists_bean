package com.abilists.bean.para.admin.system;

import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class UdtDbPara extends CommonPara {

	private String dbDatabase;

	@CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 100 ,message = "dbName must not exceed {max} characters")
	private String username;

	@CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 100 ,message = "dbPassword must not exceed {max} characters")
	private String currentPassword;

	@CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 100 ,message = "dbPassword must not exceed {max} characters")
	private String newPassword;

	public String getDbDatabase() {
		return dbDatabase;
	}

	public void setDbDatabase(String dbDatabase) {
		this.dbDatabase = dbDatabase;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
