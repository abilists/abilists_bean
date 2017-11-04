package com.abilists.bean.para.task;

import com.abilists.bean.para.CommonPara;

public class SltTaskPara extends CommonPara {

	private String utkNo;
	private String utkWorkDay;
	private String utkTask;
    private String utkWorkHour;
    private String forView;
    
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
	public String getForView() {
		return forView;
	}
	public void setForView(String forView) {
		this.forView = forView;
	}

}