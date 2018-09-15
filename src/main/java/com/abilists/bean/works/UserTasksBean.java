package com.abilists.bean.works;

import java.util.Map;

public class UserTasksBean {

	private String statusName;
	private String color;
	private String month;
	private Map<String, Integer> userTasksStatusMap;

	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Map<String, Integer> getUserTasksStatusMap() {
		return userTasksStatusMap;
	}
	public void setUserTasksStatusMap(Map<String, Integer> userTasksStatusMap) {
		this.userTasksStatusMap = userTasksStatusMap;
	}

}
