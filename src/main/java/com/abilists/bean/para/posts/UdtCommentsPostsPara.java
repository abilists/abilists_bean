package com.abilists.bean.para.posts;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.ByteString;


public class UdtCommentsPostsPara extends CommonPara {

	private String ucpNo;
	private String upsNo;

	private String ucpParentNo;
	private String ucpDepth;
	private String ucpOrder;
	private String ucpTitle;

	@ByteString(charset = "UTF-8", min = 1, max = 1000, message = "parameter.error.size.max950.message") // 5000
	private String ucpComment;
	private String ucpStatus;

	public String getUcpNo() {
		return ucpNo;
	}
	public void setUcpNo(String ucpNo) {
		this.ucpNo = ucpNo;
	}
	public String getUpsNo() {
		return upsNo;
	}
	public void setUpsNo(String upsNo) {
		this.upsNo = upsNo;
	}
	public String getUcpParentNo() {
		return ucpParentNo;
	}
	public void setUcpParentNo(String ucpParentNo) {
		this.ucpParentNo = ucpParentNo;
	}
	public String getUcpDepth() {
		return ucpDepth;
	}
	public void setUcpDepth(String ucpDepth) {
		this.ucpDepth = ucpDepth;
	}
	public String getUcpOrder() {
		return ucpOrder;
	}
	public void setUcpOrder(String ucpOrder) {
		this.ucpOrder = ucpOrder;
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

}
