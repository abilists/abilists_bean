package com.abilists.bean.para.works;

import java.util.Map;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.Array;

public class UdtProjectsSortPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@Array(message = "parameter.error.array.message")
	private String[] upNo;

	@NotNull(message = "parameter.error.null.message")
	@Array(message = "parameter.error.array.message")
	private String[] upSort;

	private Map<Integer, Integer> mapUpSort;

	public String[] getUpNo() {
		return upNo;
	}

	public void setUpNo(String[] upNo) {
		this.upNo = upNo;
	}

	public String[] getUpSort() {
		return upSort;
	}

	public void setUpSort(String[] upSort) {
		this.upSort = upSort;
	}

	public Map<Integer, Integer> getMapUpSort() {
		return mapUpSort;
	}

	public void setMapUpSort(Map<Integer, Integer> mapUpSort) {
		this.mapUpSort = mapUpSort;
	}	

}