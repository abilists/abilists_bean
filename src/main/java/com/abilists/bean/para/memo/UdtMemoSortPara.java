package com.abilists.bean.para.memo;

import java.util.List;

import com.abilists.bean.MemoSortBean;

import base.bean.para.CommonPara;

public class UdtMemoSortPara extends CommonPara {

	private List<MemoSortBean> memoSortBeanList;

	public List<MemoSortBean> getMemoSortBeanList() {
		return memoSortBeanList;
	}

	public void setMemoSortBeanList(List<MemoSortBean> memoSortBeanList) {
		this.memoSortBeanList = memoSortBeanList;
	}

}