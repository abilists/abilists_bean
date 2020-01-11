package com.abilists.bean.admin.license;

import com.abilists.bean.para.admin.license.IstLicensePara;

public class LicenseBean {

	private String serverName;
	private String serverId;
	private IstLicensePara istLicensePara;

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
