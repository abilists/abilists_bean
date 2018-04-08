package com.abilists.bean.para.task;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.abilists.bean.para.CommonPara;

import io.utility.validate.annotation.CharacterEscape;
import io.utility.validate.annotation.DateFormat;
import io.utility.validate.annotation.IsInteger;

public class UdtTaskPara extends CommonPara {

	private String utkNo;

    @NotNull(message = "parameter.error.null.message")
    @Size(min = 9, max = 10 ,message = "parameter.error.size.max10.message")
    @DateFormat(format = "yyyy-MM-dd", message = "parameter.error.date.format.message")
	private String utkWorkDay;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(max = 1000, message = "parameter.error.size.max1000.message")
	private String utkTask;

    @IsInteger(message = "parameter.error.integer.message")
    @Size(max = 10, message = "parameter.error.size.max10.message")
    private String utkWorkHour;

	public String getUtkNo() {
		return utkNo;
	}
	public void setUtkNo(String utkNo) {
		this.utkNo = utkNo;
	}
	public String getUtkWorkDay() {
		return utkWorkDay;
	}
	public void setUtkWorkDay(String utkWorkDay) {
		this.utkWorkDay = utkWorkDay;
	}
	public String getUtkTask() {
		return utkTask;
	}
	public void setUtkTask(String utkTask) {
		this.utkTask = utkTask;
	}
	public String getUtkWorkHour() {
		return utkWorkHour;
	}
	public void setUtkWorkHour(String utkWorkHour) {
		this.utkWorkHour = utkWorkHour;
	}

}