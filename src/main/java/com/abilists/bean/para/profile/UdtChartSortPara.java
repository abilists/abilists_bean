package com.abilists.bean.para.profile;

import java.util.List;

import com.abilists.bean.ChartSortBean;

import base.bean.para.CommonPara;

public class UdtChartSortPara extends CommonPara {

	private List<ChartSortBean> chartSortBeanList;

	public List<ChartSortBean> getChartSortBeanList() {
		return chartSortBeanList;
	}

	public void setChartSortBeanList(List<ChartSortBean> chartSortBeanList) {
		this.chartSortBeanList = chartSortBeanList;
	}

}