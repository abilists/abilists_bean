package com.abilists.bean.para.memo;

import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class SltMemoPara extends CommonPara {

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@Size(min = 1, max = 10, message = "parameter.error.size.max10.message")
	private String umNo;

	public String getUmNo() {
		return umNo;
	}

	public void setUmNo(String umNo) {
		this.umNo = umNo;
	}

}