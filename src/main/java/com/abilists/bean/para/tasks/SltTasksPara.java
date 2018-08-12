package com.abilists.bean.para.tasks;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class SltTasksPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String utNo;
	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String utSort;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(max = 2500, message = "parameter.error.size.max50.message")    
	private String utTitle;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(max = 2500, message = "parameter.error.size.max2500.message")
	private String utTask;

	private String utKind;
	private String utProgress;
	private String utStartDay;
	private String utEndDay;
	private String utHour;
    private String upNo;
    private String forView;

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
	public String getUtHour() {
		return utHour;
	}
	public void setUtHour(String utHour) {
		this.utHour = utHour;
	}
	public String getUpNo() {
		return upNo;
	}
	public void setUpNo(String upNo) {
		this.upNo = upNo;
	}
	public String getForView() {
		return forView;
	}
	public void setForView(String forView) {
		this.forView = forView;
	}

}