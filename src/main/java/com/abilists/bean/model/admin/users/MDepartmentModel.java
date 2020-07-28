package com.abilists.bean.model.admin.users;

import java.io.Serializable;
import java.util.Date;

import base.bean.model.BasicModel;

public class MDepartmentModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long mdtNo;
	private String mdtName;
	private String mdtCode;
	private String mdtUrl;
	private String mdtImg;
	private String mdtExplain;
	private String mdtStatus;
	private String mdtDelete;
	private long mcpNo;
	private String mcpDomain;
	private Date insertTime;
	private Date updateTime;

	public long getMdtNo() {
		return mdtNo;
	}
	public void setMdtNo(long mdtNo) {
		this.mdtNo = mdtNo;
	}
	public String getMdtName() {
		return mdtName;
	}
	public void setMdtName(String mdtName) {
		this.mdtName = mdtName;
	}
	public String getMdtCode() {
		return mdtCode;
	}
	public void setMdtCode(String mdtCode) {
		this.mdtCode = mdtCode;
	}
	public String getMdtUrl() {
		return mdtUrl;
	}
	public void setMdtUrl(String mdtUrl) {
		this.mdtUrl = mdtUrl;
	}
	public String getMdtImg() {
		return mdtImg;
	}
	public void setMdtImg(String mdtImg) {
		this.mdtImg = mdtImg;
	}
	public String getMdtExplain() {
		return mdtExplain;
	}
	public void setMdtExplain(String mdtExplain) {
		this.mdtExplain = mdtExplain;
	}
	public String getMdtStatus() {
		return mdtStatus;
	}
	public void setMdtStatus(String mdtStatus) {
		this.mdtStatus = mdtStatus;
	}
	public String getMdtDelete() {
		return mdtDelete;
	}
	public void setMdtDelete(String mdtDelete) {
		this.mdtDelete = mdtDelete;
	}
	public long getMcpNo() {
		return mcpNo;
	}
	public void setMcpNo(long mcpNo) {
		this.mcpNo = mcpNo;
	}
	public String getMcpDomain() {
		return mcpDomain;
	}
	public void setMcpDomain(String mcpDomain) {
		this.mcpDomain = mcpDomain;
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
