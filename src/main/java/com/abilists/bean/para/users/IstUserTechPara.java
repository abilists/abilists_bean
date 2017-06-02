package com.abilists.bean.para.users;

import javax.validation.constraints.NotNull;

import com.abilists.bean.para.CommonPara;

/**
 * 
 * @author njoonk
 */
public class IstUserTechPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	private String utSkill;

	@NotNull(message = "parameter.error.null.message")
	private String mtNo;

	private String utKind;

	private String utLevel;

	private String utDetail;

	public String getUtSkill() {
		return utSkill;
	}

	public void setUtSkill(String utSkill) {
		this.utSkill = utSkill;
	}

	public String getMtNo() {
		return mtNo;
	}

	public void setMtNo(String mtNo) {
		this.mtNo = mtNo;
	}

	public String getUtKind() {
		return utKind;
	}

	public void setUtKind(String utKind) {
		this.utKind = utKind;
	}

	public String getUtLevel() {
		return utLevel;
	}

	public void setUtLevel(String utLevel) {
		this.utLevel = utLevel;
	}

	public String getUtDetail() {
		return utDetail;
	}

	public void setUtDetail(String utDetail) {
		this.utDetail = utDetail;
	}

}