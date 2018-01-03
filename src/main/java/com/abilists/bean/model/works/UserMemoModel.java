package com.abilists.bean.model.works;

import java.io.Serializable;
import java.util.Date;

public class UserMemoModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long umNo;
	private String umTitle;
	private String umMemo;
	private String umStatus;
	private String umDelete;
	private String userId;
	private Date insertDate;
	private Date updateDate;

	public long getUmNo() {
		return umNo;
	}
	public void setUmNo(long umNo) {
		this.umNo = umNo;
	}
	public String getUmTitle() {
		return umTitle;
	}
	public void setUmTitle(String umTitle) {
		this.umTitle = umTitle;
	}
	public String getUmMemo() {
		return umMemo;
	}
	public void setUmMemo(String umMemo) {
		this.umMemo = umMemo;
	}
	public String getUmStatus() {
		return umStatus;
	}
	public void setUmStatus(String umStatus) {
		this.umStatus = umStatus;
	}
	public String getUmDelete() {
		return umDelete;
	}
	public void setUmDelete(String umDelete) {
		this.umDelete = umDelete;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
}
