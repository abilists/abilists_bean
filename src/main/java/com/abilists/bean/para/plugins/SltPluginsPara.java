package com.abilists.bean.para.plugins;

import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class SltPluginsPara extends CommonPara {

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@Size(min = 1, max = 10, message = "parameter.error.size.max10.message")
	private String mpNo;

	private String mpName;

	public String getMpNo() {
		return mpNo;
	}

	public void setMpNo(String mpNo) {
		this.mpNo = mpNo;
	}

	public String getMpName() {
		return mpName;
	}

	public void setMpName(String mpName) {
		this.mpName = mpName;
	}

}