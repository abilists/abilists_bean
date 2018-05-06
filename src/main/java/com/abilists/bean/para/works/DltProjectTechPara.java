package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.abilists.bean.para.CommonPara;

/**
 * Action + db name + data
 * 
 * @author njoonk
 */
public class DltProjectTechPara extends CommonPara {

//	@NotNull(message = "parameter.error.null.message")
//  @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String upNo;

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String uptNo;

	public String getUpNo() {
		return upNo;
	}

	public void setUpNo(String upNo) {
		this.upNo = upNo;
	}

	public String getUptNo() {
		return uptNo;
	}

	public void setUptNo(String uptNo) {
		this.uptNo = uptNo;
	}
	
}