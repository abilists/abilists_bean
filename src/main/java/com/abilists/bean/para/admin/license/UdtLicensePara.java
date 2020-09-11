package com.abilists.bean.para.admin.license;

import javax.validation.constraints.NotNull;

public class UdtLicensePara extends IstLicensePara {

	@NotNull(message = "parameter.error.null.message")
	private String serverEmail;

	private String serverLicence;

	private String serverUserCnt;

	private String serverStatus;

	public String getServerEmail() {
		return serverEmail;
	}

	public void setServerEmail(String serverEmail) {
		this.serverEmail = serverEmail;
	}

	public String getServerLicence() {
		return serverLicence;
	}

	public void setServerLicence(String serverLicence) {
		this.serverLicence = serverLicence;
	}

	public String getServerUserCnt() {
		return serverUserCnt;
	}

	public void setServerUserCnt(String serverUserCnt) {
		this.serverUserCnt = serverUserCnt;
	}

	public String getServerStatus() {
		return serverStatus;
	}

	public void setServerStatus(String serverStatus) {
		this.serverStatus = serverStatus;
	}

}
