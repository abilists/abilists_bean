package com.abilists.bean.para.posts;

import base.bean.para.CommonPara;


public class SltPostsPara extends CommonPara {

	private String targetUserId;
	private String targetUpsNo;
	private String targetCmt;
	private String targetUcpNo;

	public String getTargetUserId() {
		return targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}

	public String getTargetUpsNo() {
		return targetUpsNo;
	}

	public void setTargetUpsNo(String targetUpsNo) {
		this.targetUpsNo = targetUpsNo;
	}

	public String getTargetCmt() {
		return targetCmt;
	}

	public void setTargetCmt(String targetCmt) {
		this.targetCmt = targetCmt;
	}

	public String getTargetUcpNo() {
		return targetUcpNo;
	}

	public void setTargetUcpNo(String targetUcpNo) {
		this.targetUcpNo = targetUcpNo;
	}

}
