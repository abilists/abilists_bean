package com.abilists.bean.para.list;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.AllowString;

public class IstMyListPara extends CommonPara {

	private String userNo;
    private String umlUserId;
    
    // TODO: message
    @AllowString(message = "parameter.error.integer.message")
    private String umlStatus;

    private String umlDelete;

	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUmlUserId() {
		return umlUserId;
	}
	public void setUmlUserId(String umlUserId) {
		this.umlUserId = umlUserId;
	}
	public String getUmlStatus() {
		return umlStatus;
	}
	public void setUmlStatus(String umlStatus) {
		this.umlStatus = umlStatus;
	}
	public String getUmlDelete() {
		return umlDelete;
	}
	public void setUmlDelete(String umlDelete) {
		this.umlDelete = umlDelete;
	}
    
}