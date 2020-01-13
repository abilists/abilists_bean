package com.abilists.bean.admin.license;

import com.abilists.bean.para.admin.license.IstLicensePara;

public class LicenseBean {

	private String serverName;
	private String serverId;
	private String serverLicence;
	private long serverUserCount;

	private IstLicensePara istLicensePara;

	public String getServerLicence() {
		return serverLicence;
	}

	public void setServerLicence(String serverLicence) {
		this.serverLicence = serverLicence;
	}

	public long getServerUserCount() {
		return serverUserCount;
	}

	public void setServerUserCount(long serverUserCount) {
		this.serverUserCount = serverUserCount;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerId() {
		return serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public IstLicensePara getIstLicensePara() {
		return istLicensePara;
	}

	public void setIstLicensePara(IstLicensePara istLicensePara) {
		this.istLicensePara = istLicensePara;
	}

}
