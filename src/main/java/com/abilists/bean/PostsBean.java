package com.abilists.bean;

import com.abilists.bean.model.posts.UserUbPostsModel;

// UserPostsModel
public class PostsBean extends UserUbPostsModel {

	private static final long serialVersionUID = 1L;

	private String urlPath;
	private String upsFileData;

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

}