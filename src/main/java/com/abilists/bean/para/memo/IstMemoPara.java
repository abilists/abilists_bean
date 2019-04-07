package com.abilists.bean.para.memo;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;

public class IstMemoPara extends CommonPara {

	private String umTitle;

	// TODO: Can write any characters for developer
	// @CharacterEscape(message = "parameter.error.escape.character.message")
	@ByteString(charset = "UTF-8", min = 1, max = 4900, message = "parameter.error.size.max4900.message") // 5000
	private String umMemo;

	private String umBgColor;

	private String umStatus;

	public String getUmTitle() {
		return umTitle;
	}

	public void setUmTitle(String umTitle) {
		this.umTitle = umTitle;
	}

	public String getUmMemo() {
		return umMemo;
	}

	public void setUmMemo(String umMemo) {
		this.umMemo = umMemo;
	}

	public String getUmBgColor() {
		return umBgColor;
	}

	public void setUmBgColor(String umBgColor) {
		this.umBgColor = umBgColor;
	}

	public String getUmStatus() {
		return umStatus;
	}

	public void setUmStatus(String umStatus) {
		this.umStatus = umStatus;
	}

}