package com.abilists.bean.model.posts;

import java.io.Serializable;

import base.bean.model.BasicModel;

public class OrderMaxUserCommentsPostsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long ucpDepth;

	public OrderMaxUserCommentsPostsModel() {
	}

	public OrderMaxUserCommentsPostsModel(OrderMaxUserCommentsPostsModel userCommentsPosts){
		this.ucpDepth = userCommentsPosts.getUcpDepth();
	}

	public long getUcpDepth() {
		return ucpDepth;
	}

	public void setUcpDepth(long ucpDepth) {
		this.ucpDepth = ucpDepth;
	}

}
