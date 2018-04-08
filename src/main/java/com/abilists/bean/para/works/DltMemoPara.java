package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.abilists.bean.para.CommonPara;

public class DltMemoPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String umNo;

	public String getUmNo() {
		return umNo;
	}

	public void setUmNo(String umNo) {
		this.umNo = umNo;
	}

}