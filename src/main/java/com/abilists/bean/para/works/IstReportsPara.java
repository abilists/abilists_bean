package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.DateFormat;
import io.utility.validate.annotation.IsLong;

public class IstReportsPara extends CommonPara {

	@NotNull(message = "utkWorkDay")
	@Size(min = 9, max = 10, message = "It is different String size")
	@DateFormat(format = "yyyy-MM-dd", message = "Not right format for start of date")
	private String urWorkDay;

	@IsLong(message = "parameter.error.integer.message")
	@Size(max = 5, message = "parameter.error.size.max5.message")
	private String urWorkHour;

	// @CharacterEscape(message = "parameter.error.escape.character.message")
	@ByteString(charset = "UTF-8", min = 1, max = 2900, message = "parameter.error.size.max2900.message") // 3000
	private String urReport;

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