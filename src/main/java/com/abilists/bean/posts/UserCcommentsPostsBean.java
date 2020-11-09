package com.abilists.bean.posts;

import com.abilists.bean.model.posts.UserCommentsPostsModel;

public class UserCcommentsPostsBean extends UserCommentsPostsModel {

	private static final long serialVersionUID = 1L;

	private int gapTime;
	private String timeStatus;

	public UserCcommentsPostsBean(UserCommentsPostsModel userCommentsPosts) {
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

}
