package com.abilists.bean.para.noti;

import base.bean.para.CommonPara;

public class SltNotiPara extends CommonPara {

//    @NotNull(message = "notiNo")
//    @Size(min = 8, max = 10 ,message = "notiNo")
	private String notiNo;

	public String getNotiNo() {
		return notiNo;
	}

	public void setNotiNo(String notiNo) {
		this.notiNo = notiNo;
	}

}
