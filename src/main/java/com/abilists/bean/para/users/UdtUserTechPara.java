package com.abilists.bean.para.users;

import javax.validation.constraints.NotNull;

import com.abilists.bean.para.CommonPara;

import io.utility.validate.annotation.Array;
import io.utility.validate.annotation.ArrayMax;

/**
 * 
 * @author njoonk
 */
public class UdtUserTechPara extends CommonPara {

	private String[] utNo;

	@NotNull(message = "parameter.error.null.message")
	private String utSkill;

	@NotNull(message = "parameter.error.null.message")
	@Array(message = "parameter.error.array.message")
	private String[] mtNo;

	private String[] utKind;

	private String[] utLevel;

	@ArrayMax(max = 100, message = "parameter.error.array.size.max100.message")
	private String[] utDetail;

	private String[] req;

	private String cnt;

	public String[] getUtNo() {
		return utNo;
	}

	public void setUtNo(String[] utNo) {
		this.utNo = utNo;
	}

	public String getUtSkill() {
		return utSkill;
	}

	public void setUtSkill(String utSkill) {
		this.utSkill = utSkill;
	}

	public String[] getMtNo() {
		return mtNo;
	}

	public void setMtNo(String[] mtNo) {
		this.mtNo = mtNo;
	}

	public String[] getUtKind() {
		return utKind;
	}

	public void setUtKind(String[] utKind) {
		this.utKind = utKind;
	}

	public String[] getUtLevel() {
		return utLevel;
	}

	public void setUtLevel(String[] utLevel) {
		this.utLevel = utLevel;
	}

	public String[] getUtDetail() {
		return utDetail;
	}

	public void setUtDetail(String[] utDetail) {
		this.utDetail = utDetail;
	}

	public String[] getReq() {
		return req;
	}

	public void setReq(String[] req) {
		this.req = req;
	}

	public String getCnt() {
		return cnt;
	}

	public void setCnt(String cnt) {
		this.cnt = cnt;
	}

}