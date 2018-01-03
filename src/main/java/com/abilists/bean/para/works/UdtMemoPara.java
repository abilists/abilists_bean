package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.abilists.bean.para.CommonPara;

import io.utility.validate.annotation.CharacterEscape;

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

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@Size(min = 1, max = 300, message = "parameter.error.size.max700.message")
	private String umMemo;

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