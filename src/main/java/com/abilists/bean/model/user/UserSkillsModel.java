package com.abilists.bean.model.user;

import java.io.Serializable;
import java.util.Date;

import com.abilists.bean.model.BasicModel;

public class UserSkillsModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int usNo;
	private String usSkill;
	private String usKind;
	private String usLevel;
	private String usDetail;
	private String usStatus;
	private String usDelete;
	private int mtNo;
	private String userId;
	private Date insertTime;
	private Date updateTime;
	public int getUsNo() {
		return usNo;
	}
	public void setUsNo(int usNo) {
		this.usNo = usNo;
	}
	public String getUsSkill() {
		return usSkill;
	}
	public void setUsSkill(String usSkill) {
		this.usSkill = usSkill;
	}
	public String getUsKind() {
		return usKind;
	}
	public void setUsKind(String usKind) {
		this.usKind = usKind;
	}
	public String getUsLevel() {
		return usLevel;
	}
	public void setUsLevel(String usLevel) {
		this.usLevel = usLevel;
	}
	public String getUsDetail() {
		return usDetail;
	}
	public void setUsDetail(String usDetail) {
		this.usDetail = usDetail;
	}
	public String getUsStatus() {
		return usStatus;
	}
	public void setUsStatus(String usStatus) {
		this.usStatus = usStatus;
	}
	public String getUsDelete() {
		return usDelete;
	}
	public void setUsDelete(String usDelete) {
		this.usDelete = usDelete;
	}
	public int getMtNo() {
		return mtNo;
	}
	public void setMtNo(int mtNo) {
		this.mtNo = mtNo;
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
