package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.DateFormat;
import io.utility.validate.annotation.IsInteger;

public class UdtReportsPara extends CommonPara {

	private String urNo;

	@NotNull(message = "parameter.error.null.message")
	@Size(min = 9, max = 10, message = "parameter.error.size.max10.message")
	@DateFormat(format = "yyyy-MM-dd", message = "parameter.error.date.format.message")
	private String urWorkDay;

	@IsInteger(message = "parameter.error.integer.message")
	@Size(max = 5, message = "parameter.error.size.max5.message")
	private String urWorkHour;

	// @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(charset = "UTF-8", min = 1, max = 2900, message = "parameter.error.size.max2900.message") // 3000
	private String urReport;

	public String getUrNo() {
		return urNo;
	}

	public void setUrNo(String urNo) {
		this.urNo = urNo;
	}

	public String getUrWorkDay() {
		return urWorkDay;
	}

	public void setUrWorkDay(String urWorkDay) {
		this.urWorkDay = urWorkDay;
	}

	public String getUrWorkHour() {
		return urWorkHour;
	}

	public void setUrWorkHour(String urWorkHour) {
		this.urWorkHour = urWorkHour;
	}

	public String getUrReport() {
		return urReport;
	}

	public void setUrReport(String urReport) {
		this.urReport = urReport;
	}

}