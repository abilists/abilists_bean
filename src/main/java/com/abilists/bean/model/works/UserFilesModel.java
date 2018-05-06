package com.abilists.bean.model.works;

import java.io.Serializable;
import java.util.Date;

import com.abilists.bean.model.BasicModel;

public class UserFilesModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long ufNo;
	private String ufKind;
	private long ufNum;
	private String ufName;
	private String ufPath;
	private String ufStatus;
	private String ufDelete;
	private String userId;
	private Date insertTime;
	private Date updateTime;

	public long getUfNo() {
		return ufNo;
	}
	public void setUfNo(long ufNo) {
		this.ufNo = ufNo;
	}
	public String getUfKind() {
		return ufKind;
	}
	public void setUfKind(String ufKind) {
		this.ufKind = ufKind;
	}
	public long getUfNum() {
		return ufNum;
	}
	public void setUfNum(long ufNum) {
		this.ufNum = ufNum;
	}
	public String getUfName() {
		return ufName;
	}
	public void setUfName(String ufName) {
		this.ufName = ufName;
	}
	public String getUfPath() {
		return ufPath;
	}
	public void setUfPath(String ufPath) {
		this.ufPath = ufPath;
	}
	public String getUfStatus() {
		return ufStatus;
	}
	public void setUfStatus(String ufStatus) {
		this.ufStatus = ufStatus;
	}
	public String getUfDelete() {
		return ufDelete;
	}
	public void setUfDelete(String ufDelete) {
		this.ufDelete = ufDelete;
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
