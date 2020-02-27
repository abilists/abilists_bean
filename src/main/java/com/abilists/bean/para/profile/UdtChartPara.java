package com.abilists.bean.para.profile;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.BitAllowString;

public class UdtChartPara extends CommonPara {

	private String uctNo;
	@BitAllowString(message = "parameter.error.bit.message")
	private String uctStatus;

	public String getUctNo() {
		return uctNo;
	}

	public void setUctNo(String uctNo) {
		this.uctNo = uctNo;
	}

	public String getUctStatus() {
		return uctStatus;
	}

	public void setUctStatus(String uctStatus) {
		this.uctStatus = uctStatus;
	}

}