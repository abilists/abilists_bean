package com.abilists.bean.model.posts;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class UserCommentsPostsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long ucpNo;
	private int ucpParentNo;
	private int ucpDepth;
	private String ucpTitle;
	private String ucpComment;
	private String ucpStatus;
	private String ucpDelete;
	private long upsNo;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	UserCommentsPostsModel(){
	}

	public UserCommentsPostsModel(UserCommentsPostsModel userCommentsPosts){
		this.ucpNo = userCommentsPosts.getUcpNo();
		this.ucpParentNo = userCommentsPosts.getUcpParentNo();
		this.ucpDepth = userCommentsPosts.getUcpDepth();
		this.ucpTitle = userCommentsPosts.getUcpTitle();
		this.ucpComment = userCommentsPosts.getUcpComment();
		this.ucpStatus = userCommentsPosts.getUcpStatus();
		this.ucpDelete = userCommentsPosts.getUcpDelete();
		this.upsNo = userCommentsPosts.getUpsNo();
		this.userId = userCommentsPosts.getUserId();
		this.insertTime = userCommentsPosts.getInsertTime();
		this.updateTime = userCommentsPosts.getUpdateTime();
		this.setToken(userCommentsPosts.getToken());
	}

	public long getUcpNo() {
		return ucpNo;
	}

	public void setUcpNo(long ucpNo) {
		this.ucpNo = ucpNo;
	}

	public int getUcpParentNo() {
		return ucpParentNo;
	}

	public void setUcpParentNo(int ucpParentNo) {
		this.ucpParentNo = ucpParentNo;
	}

	public int getUcpDepth() {
		return ucpDepth;
	}

	public void setUcpDepth(int ucpDepth) {
		this.ucpDepth = ucpDepth;
	}

	public String getUcpTitle() {
		return ucpTitle;
	}

	public void setUcpTitle(String ucpTitle) {
		this.ucpTitle = ucpTitle;
	}

	public String getUcpComment() {
		return ucpComment;
	}

	public void setUcpComment(String ucpComment) {
		this.ucpComment = ucpComment;
	}

	public String getUcpStatus() {
		return ucpStatus;
	}

	public void setUcpStatus(String ucpStatus) {
		this.ucpStatus = ucpStatus;
	}

	public String getUcpDelete() {
		return ucpDelete;
	}

	public void setUcpDelete(String ucpDelete) {
		this.ucpDelete = ucpDelete;
	}

	public long getUpsNo() {
		return upsNo;
	}

	public void setUpsNo(long upsNo) {
		this.upsNo = upsNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
