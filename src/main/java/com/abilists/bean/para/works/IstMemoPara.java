package com.abilists.bean.para.works;

import javax.validation.constraints.Size;

import com.abilists.bean.para.CommonPara;

import io.utility.validate.annotation.CharacterEscape;

/**
 * 
 * @author Joon Kim
 *
 */
public class IstMemoPara extends CommonPara {

	private String umTitle;

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@Size(min = 1, max = 1000, message = "parameter.error.size.max1000.message")
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