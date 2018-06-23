package com.abilists.bean.model.admin.sum;

import java.io.Serializable;

public class AdminUserReportsSumModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;
	private String yearMonth;
	private int cntUserId;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}
	public int getCntUserId() {
		return cntUserId;
	}
	public void setCntUserId(int cntUserId) {
		this.cntUserId = cntUserId;
	}
	
}
