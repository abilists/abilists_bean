package com.abilists.bean.para.memo;

import java.util.Map;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.Array;

public class UdtMemoSortPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	@Array(message = "parameter.error.array.message")
	private String[] umNo;

	@NotNull(message = "parameter.error.null.message")
	@Array(message = "parameter.error.array.message")
	private String[] umSort;

	private Map<Integer, Integer> mapUmSort;

	public String[] getUmNo() {
		return umNo;
	}

	public void setUmNo(String[] umNo) {
		this.umNo = umNo;
	}

	public String[] getUmSort() {
		return umSort;
	}

	public void setUmSort(String[] umSort) {
		this.umSort = umSort;
	}

	public Map<Integer, Integer> getMapUmSort() {
		return mapUmSort;
	}

	public void setMapUmSort(Map<Integer, Integer> mapUmSort) {
		this.mapUmSort = mapUmSort;
	}	

}