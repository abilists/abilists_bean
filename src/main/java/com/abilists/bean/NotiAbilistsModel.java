package com.abilists.bean;

import java.util.List;

import com.abilists.bean.model.join.NotificationJoinUserNotiModel;
import com.abilists.bean.model.notice.UserNoticeModel;

import base.bean.model.CommonModel;

public class NotiAbilistsModel extends CommonModel {

	private int notiCnt;
	private List<NotificationJoinUserNotiModel> userNotiList;

	private int userNoticeCnt;
	private List<UserNoticeModel> userNoticeList;

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
	public int getUserNoticeCnt() {
		return userNoticeCnt;
	}
	public void setUserNoticeCnt(int userNoticeCnt) {
		this.userNoticeCnt = userNoticeCnt;
	}
	public List<UserNoticeModel> getUserNoticeList() {
		return userNoticeList;
	}
	public void setUserNoticeList(List<UserNoticeModel> userNoticeList) {
		this.userNoticeList = userNoticeList;
	}

}