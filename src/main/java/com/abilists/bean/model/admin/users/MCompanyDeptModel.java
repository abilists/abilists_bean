package com.abilists.bean.model.admin.users;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import base.bean.model.BasicModel;

public class MCompanyDeptModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long mcpNo;
	private String mcpDomain;
	private String mcpName;
	private String mcpLogo;
	private String mcpEmployeeSize;
	private String mcpType;
	private String mcpHeadquarter;
	private String mcpRegion;
	private String mcpFoundationDate;
	private String mcpUrl;
	private String mcpStatus;
	private String mcpDelete;
	private Date insertTime;
	private Date updateTime;

	private List<MDepartmentModel> subMDepartmentList;
	
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
	public String getMcpName() {
		return mcpName;
	}
	public void setMcpName(String mcpName) {
		this.mcpName = mcpName;
	}
	public String getMcpLogo() {
		return mcpLogo;
	}
	public void setMcpLogo(String mcpLogo) {
		this.mcpLogo = mcpLogo;
	}
	public String getMcpEmployeeSize() {
		return mcpEmployeeSize;
	}
	public void setMcpEmployeeSize(String mcpEmployeeSize) {
		this.mcpEmployeeSize = mcpEmployeeSize;
	}
	public String getMcpType() {
		return mcpType;
	}
	public void setMcpType(String mcpType) {
		this.mcpType = mcpType;
	}
	public String getMcpHeadquarter() {
		return mcpHeadquarter;
	}
	public void setMcpHeadquarter(String mcpHeadquarter) {
		this.mcpHeadquarter = mcpHeadquarter;
	}
	public String getMcpRegion() {
		return mcpRegion;
	}
	public void setMcpRegion(String mcpRegion) {
		this.mcpRegion = mcpRegion;
	}
	public String getMcpFoundationDate() {
		return mcpFoundationDate;
	}
	public void setMcpFoundationDate(String mcpFoundationDate) {
		this.mcpFoundationDate = mcpFoundationDate;
	}
	public String getMcpUrl() {
		return mcpUrl;
	}
	public void setMcpUrl(String mcpUrl) {
		this.mcpUrl = mcpUrl;
	}
	public String getMcpStatus() {
		return mcpStatus;
	}
	public void setMcpStatus(String mcpStatus) {
		this.mcpStatus = mcpStatus;
	}
	public String getMcpDelete() {
		return mcpDelete;
	}
	public void setMcpDelete(String mcpDelete) {
		this.mcpDelete = mcpDelete;
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
	public List<MDepartmentModel> getSubMDepartmentList() {
		return subMDepartmentList;
	}
	public void setSubMDepartmentList(List<MDepartmentModel> subMDepartmentList) {
		this.subMDepartmentList = subMDepartmentList;
	}

}
