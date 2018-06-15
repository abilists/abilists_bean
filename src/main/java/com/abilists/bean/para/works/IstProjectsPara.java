package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

/**
 * Action + db name + data
 * 
 * @author njoonk
 *
 */
public class IstProjectsPara extends CommonPara {

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 50, message = "parameter.error.size.max50.message")
	private String upName;

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 2500, message = "parameter.error.size.max2500.message")
    private String upExplain;

	private String upMembers;

	private String upCodeIndustry;

    private String upCodeRole;

    private String upStatus;

	public String getUpName() {
		return upName;
	}

	public void setUpName(String upName) {
		this.upName = upName;
	}

	public String getUpExplain() {
		return upExplain;
	}

	public void setUpExplain(String upExplain) {
		this.upExplain = upExplain;
	}

	public String getUpMembers() {
		return upMembers;
	}

	public void setUpMembers(String upMembers) {
		this.upMembers = upMembers;
	}

	public String getUpCodeIndustry() {
		return upCodeIndustry;
	}

	public void setUpCodeIndustry(String upCodeIndustry) {
		this.upCodeIndustry = upCodeIndustry;
	}

	public String getUpCodeRole() {
		return upCodeRole;
	}

	public void setUpCodeRole(String upCodeRole) {
		this.upCodeRole = upCodeRole;
	}

	public String getUpStatus() {
		return upStatus;
	}

	public void setUpStatus(String upStatus) {
		this.upStatus = upStatus;
	}

}