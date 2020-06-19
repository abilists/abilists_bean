package com.abilists.bean.posts;

import java.util.List;

import com.abilists.bean.model.posts.UserCommentsTargetUserModel;
import com.abilists.bean.model.posts.UserUbPostsModel;

// UserPostsModel
public class PostsBean extends UserUbPostsModel {

	private static final long serialVersionUID = 1L;

	private String urlPath;
	private String upsFileData;
	// For the show more button on web
	private int cntNewLine;

	private List<UserCommentsTargetUserModel> userCommentsTargetUserList;

	private int gapTime;
	private String timeStatus;

	public PostsBean(UserUbPostsModel userPosts) {
		super(userPosts);
	}

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public String getUpsFileData() {
		return upsFileData;
	}

	public void setUpsFileData(String upsFileData) {
		this.upsFileData = upsFileData;
	}

	public int getCntNewLine() {
		return cntNewLine;
	}

	public void setCntNewLine(int cntNewLine) {
		this.cntNewLine = cntNewLine;
	}

	public List<UserCommentsTargetUserModel> getUserCommentsTargetUserList() {
		return userCommentsTargetUserList;
	}

	public void setUserCommentsTargetUserList(List<UserCommentsTargetUserModel> userCommentsTargetUserList) {
		this.userCommentsTargetUserList = userCommentsTargetUserList;
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