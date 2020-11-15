package com.abilists.bean.posts;

import java.util.List;

import com.abilists.bean.model.posts.UserCommentsPostsModel;

public class UserCommentsPostsNoticeBean extends UserCommentsPostsModel {

	private static final long serialVersionUID = 1L;

	private int gapTime;
	private String timeStatus;
	
	// Not used
	private List<UserCcommentsPostsBean> userCcommentsPostsBeanList;
	private boolean blnLast;

	public UserCommentsPostsNoticeBean(UserCommentsPostsModel userCommentsPosts) {
		super(userCommentsPosts);
	}

	public int getGapTime() {
		return gapTime;
	}

	public void setGapTime(int gapTime) {
		this.gapTime = gapTime;
	}

	public String getTimeStatus() {
		return timeStatus;
	}

	public void setTimeStatus(String timeStatus) {
		this.timeStatus = timeStatus;
	}

	public List<UserCcommentsPostsBean> getUserCcommentsPostsBeanList() {
		return userCcommentsPostsBeanList;
	}

	public void setUserCcommentsPostsBeanList(List<UserCcommentsPostsBean> userCcommentsPostsBeanList) {
		this.userCcommentsPostsBeanList = userCcommentsPostsBeanList;
	}

	public boolean isBlnLast() {
		return blnLast;
	}

	public void setBlnLast(boolean blnLast) {
		this.blnLast = blnLast;
	}

}
