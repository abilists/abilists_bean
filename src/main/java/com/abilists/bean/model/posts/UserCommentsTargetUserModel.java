package com.abilists.bean.model.posts;

import java.io.Serializable;

import base.bean.model.BasicModel;

public class UserCommentsTargetUserModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long ucpNo;
	private String userId;
	private int cnt;

	UserCommentsTargetUserModel(){
	}

	public UserCommentsTargetUserModel(UserCommentsTargetUserModel userCommentsPosts){
		this.ucpNo = userCommentsPosts.getUcpNo();
		this.userId = userCommentsPosts.getUserId();
		this.cnt = userCommentsPosts.getCnt();
	}

	public long getUcpNo() {
		return ucpNo;
	}

	public void setUcpNo(long ucpNo) {
		this.ucpNo = ucpNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
