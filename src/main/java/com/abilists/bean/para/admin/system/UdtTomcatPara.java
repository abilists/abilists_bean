package com.abilists.bean.para.admin.system;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class UdtTomcatPara extends CommonPara {

	@CharacterEscape(message = "parameter.error.escape.character.message")
	private String tomcatOs;

    @CharacterEscape(message = "parameter.error.escape.character.message")
	private String tomcatHomePath;

	public String getTomcatOs() {
		return tomcatOs;
	}

	public void setTomcatOs(String tomcatOs) {
		this.tomcatOs = tomcatOs;
	}

	public String getTomcatHomePath() {
		return tomcatHomePath;
	}

	public void setTomcatHomePath(String tomcatHomePath) {
		this.tomcatHomePath = tomcatHomePath;
	}

}
