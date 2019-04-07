package com.abilists.bean.para.memo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;

/**
 * 
 * @author Joon Kim
 *
 */
public class UdtMemoPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String umNo;

	private String umTitle;

	// Mybatis Prevent SQL injection attacks with using #, not $ 
	// @CharacterEscape(message = "parameter.error.escape.character.message")
	@ByteString(charset = "UTF-8", min = 1, max = 4900, message = "parameter.error.size.max4900.message") // 5000
	private String umMemo;

	private String umBgColor;

	private String umStatus;

	private String umDelete;


	public String getUmNo() {
		return umNo;
	}

	public void setUmNo(String umNo) {
		this.umNo = umNo;
	}

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

	public String getUmDelete() {
		return umDelete;
	}

	public void setUmDelete(String umDelete) {
		this.umDelete = umDelete;
	}


}