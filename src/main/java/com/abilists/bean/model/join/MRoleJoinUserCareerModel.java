package com.abilists.bean.model.join;

import java.io.Serializable;

public class MRoleJoinUserCareerModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mrName;
	private String ucStartMonth;
	private String ucStartYear;
	private String ucEndMonth;
	private String ucEndYear;
	private String ucPresent;
	private String mlCode;

	public String getMrName() {
		return mrName;
	}
	public void setMrName(String mrName) {
		this.mrName = mrName;
	}
	public String getUcStartMonth() {
		return ucStartMonth;
	}
	public void setUcStartMonth(String ucStartMonth) {
		this.ucStartMonth = ucStartMonth;
	}
	public String getUcStartYear() {
		return ucStartYear;
	}
	public void setUcStartYear(String ucStartYear) {
		this.ucStartYear = ucStartYear;
	}
	public String getUcEndMonth() {
		return ucEndMonth;
	}
	public void setUcEndMonth(String ucEndMonth) {
		this.ucEndMonth = ucEndMonth;
	}
	public String getUcEndYear() {
		return ucEndYear;
	}
	public void setUcEndYear(String ucEndYear) {
		this.ucEndYear = ucEndYear;
	}
	public String getUcPresent() {
		return ucPresent;
	}
	public void setUcPresent(String ucPresent) {
		this.ucPresent = ucPresent;
	}
	public String getMlCode() {
		return mlCode;
	}
	public void setMlCode(String mlCode) {
		this.mlCode = mlCode;
	}

}