package com.abilists.bean;

import java.util.List;

import com.abilists.bean.model.join.NotificationJoinUserNotiModel;

import base.bean.model.CommonModel;

public class NotiAbilistsModel extends CommonModel {

	private int notiCnt;
	private List<NotificationJoinUserNotiModel> userNotiList;

	public int getNotiCnt() {
		return notiCnt;
	}
	public void setNotiCnt(int notiCnt) {
		this.notiCnt = notiCnt;
	}
	public List<NotificationJoinUserNotiModel> getUserNotiList() {
		return userNotiList;
	}
	public void setUserNotiList(List<NotificationJoinUserNotiModel> userNotiList) {
		this.userNotiList = userNotiList;
	}

}