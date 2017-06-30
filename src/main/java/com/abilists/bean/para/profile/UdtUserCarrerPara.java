package com.abilists.bean.para.profile;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.abilists.bean.para.CommonPara;

import io.utility.validate.annotation.CharacterEscape;

/**
 * Action + db name + data
 * 
 * @author njoonk
 *
 */
public class UdtUserCarrerPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String ucNo;

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@NotNull(message = "parameter.error.null.message")
	@Size(min = 1, max = 100, message = "parameter.error.size.max100.message")
	private String ucCompanyName;

	private String ucPresent;
	private Date ucStartDate;
	private Date ucEndDate;
	private String ucTitle;
	private String ucContents;
	private String ucImg;
	private String ucStatus;
	public String getUcNo() {
		return ucNo;
	}
	public void setUcNo(String ucNo) {
		this.ucNo = ucNo;
	}
	public String getUcCompanyName() {
		return ucCompanyName;
	}
	public void setUcCompanyName(String ucCompanyName) {
		this.ucCompanyName = ucCompanyName;
	}
	public String getUcPresent() {
		return ucPresent;
	}
	public void setUcPresent(String ucPresent) {
		this.ucPresent = ucPresent;
	}
	public Date getUcStartDate() {
		return ucStartDate;
	}
	public void setUcStartDate(Date ucStartDate) {
		this.ucStartDate = ucStartDate;
	}
	public Date getUcEndDate() {
		return ucEndDate;
	}
	public void setUcEndDate(Date ucEndDate) {
		this.ucEndDate = ucEndDate;
	}
	public String getUcTitle() {
		return ucTitle;
	}
	public void setUcTitle(String ucTitle) {
		this.ucTitle = ucTitle;
	}
	public String getUcContents() {
		return ucContents;
	}
	public void setUcContents(String ucContents) {
		this.ucContents = ucContents;
	}
	public String getUcImg() {
		return ucImg;
	}
	public void setUcImg(String ucImg) {
		this.ucImg = ucImg;
	}
	public String getUcStatus() {
		return ucStatus;
	}
	public void setUcStatus(String ucStatus) {
		this.ucStatus = ucStatus;
	}

}