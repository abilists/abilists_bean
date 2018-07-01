package com.abilists.bean.para.tasks;

import java.util.Map;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.Array;

public class UdtTasksSortPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@Array(message = "parameter.error.array.message")
	private String[] utNo;

	@NotNull(message = "parameter.error.null.message")
	@Array(message = "parameter.error.array.message")
	private String[] utSort;

	private Map<Integer, Integer> mapUtSort;	

	public String[] getUtNo() {
		return utNo;
	}

	public void setUtNo(String[] utNo) {
		this.utNo = utNo;
	}

	public String[] getUtSort() {
		return utSort;
	}

	public void setUtSort(String[] utSort) {
		this.utSort = utSort;
	}

	public Map<Integer, Integer> getMapUtSort() {
		return mapUtSort;
	}

	public void setMapUtSort(Map<Integer, Integer> mapUtSort) {
		this.mapUtSort = mapUtSort;
	}

}