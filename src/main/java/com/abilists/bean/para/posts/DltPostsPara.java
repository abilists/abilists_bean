package com.abilists.bean.para.posts;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;

public class DltPostsPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 10, message = "parameter.error.size.max10.message")
	private String upsNo;

	public String getUpsNo() {
		return upsNo;
	}

	public void setUpsNo(String upsNo) {
		this.upsNo = upsNo;
	}

}
