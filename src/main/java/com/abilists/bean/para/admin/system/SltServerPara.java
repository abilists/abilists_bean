package com.abilists.bean.para.admin.system;

import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class SltServerPara extends CommonPara {

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 50 ,message = "serverHost must not exceed {max} characters")
	private String msysKind;

	public String getMsysKind() {
		return msysKind;
	}

	public void setMsysKind(String msysKind) {
		this.msysKind = msysKind;
	}

}
