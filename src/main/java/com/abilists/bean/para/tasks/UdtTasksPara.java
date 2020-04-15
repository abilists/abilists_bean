package com.abilists.bean.para.tasks;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;
import io.utility.validate.annotation.CharacterEscape;
import io.utility.validate.annotation.DateFormat;

public class UdtTasksPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String utNo;

	private String utSort;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(charset = "UTF-8", min = 1, max = 100, message = "parameter.error.size.max100.message") // 100
	private String utTitle;

	// @CharacterEscape(message = "parameter.error.escape.character.message")
    @ByteString(charset = "UTF-8", min = 1, max = 4900, message = "parameter.error.size.max4900.message") // 5000
	private String utTask;

	private String utKind;
	private String utProgress;
	
	@NotNull(message = "parameter.error.null.message")
    @DateFormat(format = "yyyy-MM-dd", message = "Not right format for start of date")
	private String utStartDay;

	@NotNull(message = "parameter.error.null.message")
    @DateFormat(format = "yyyy-MM-dd", message = "Not right format for start of date")
	private String utEndDay;

    @Size(max = 5, message = "parameter.error.size.max5.message")
	private String utTaskHour;

	private String utMarginHour;

    private String utStatus;
    private String upNo;

	public String getUtNo() {
		return utNo;
	}
	public void setUtNo(String utNo) {
		this.utNo = utNo;
	}
	public String getUtSort() {
		return utSort;
	}
	public void setUtSort(String utSort) {
		this.utSort = utSort;
	}
	public String getUtTitle() {
		return utTitle;
	}
	public void setUtTitle(String utTitle) {
		this.utTitle = utTitle;
	}
	public String getUtTask() {
		return utTask;
	}
	public void setUtTask(String utTask) {
		this.utTask = utTask;
	}
	public String getUtKind() {
		return utKind;
	}
	public void setUtKind(String utKind) {
		this.utKind = utKind;
	}
	public String getUtProgress() {
		return utProgress;
	}
	public void setUtProgress(String utProgress) {
		this.utProgress = utProgress;
	}
	public String getUtStartDay() {
		return utStartDay;
	}
	public void setUtStartDay(String utStartDay) {
		this.utStartDay = utStartDay;
	}
	public String getUtEndDay() {
		return utEndDay;
	}
	public void setUtEndDay(String utEndDay) {
		this.utEndDay = utEndDay;
	}
	public String getUtTaskHour() {
		return utTaskHour;
	}
	public void setUtTaskHour(String utTaskHour) {
		this.utTaskHour = utTaskHour;
	}
	public String getUtMarginHour() {
		return utMarginHour;
	}
	public void setUtMarginHour(String utMarginHour) {
		this.utMarginHour = utMarginHour;
	}
	public String getUtStatus() {
		return utStatus;
	}
	public void setUtStatus(String utStatus) {
		this.utStatus = utStatus;
	}
	public String getUpNo() {
		return upNo;
	}
	public void setUpNo(String upNo) {
		this.upNo = upNo;
	}

}