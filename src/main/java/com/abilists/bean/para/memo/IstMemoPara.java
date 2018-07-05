package com.abilists.bean.para.memo;

import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

/**
 * 
 * @author Joon Kim
 *
 */
public class IstMemoPara extends CommonPara {

	private String umTitle;

	// Mybatis Prevent SQL injection attacks with using #, not $ 
	// @CharacterEscape(message = "parameter.error.escape.character.message")
	@Size(min = 1, max = 2500, message = "parameter.error.size.max2500.message")
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