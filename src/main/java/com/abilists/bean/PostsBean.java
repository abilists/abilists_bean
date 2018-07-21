package com.abilists.bean;

import com.abilists.bean.model.works.UserPostsModel;

public class PostsBean extends UserPostsModel {

	private static final long serialVersionUID = 1L;

	private String urlPath;

	public PostsBean(UserPostsModel userPosts) {
		super(userPosts);
	}

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

}