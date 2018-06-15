package com.abilists.bean.para.admin;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class SrhAutoCompletePara extends CommonPara {

	private String srhColumn;
	
	@CharacterEscape(message = "parameter.error.escape.character.message", charArray = {'\'', '"', '^'})
	private String srhContents;

	public String getSrhColumn() {
		return srhColumn;
	}
	public void setSrhColumn(String srhColumn) {
		this.srhColumn = srhColumn;
	}
	public String getSrhContents() {
		return srhContents;
	}
	public void setSrhContents(String srhContents) {
		this.srhContents = srhContents;
	}

}