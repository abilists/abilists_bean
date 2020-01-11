package com.abilists.bean.para.admin.license;

import javax.validation.constraints.NotNull;

import base.bean.para.CommonPara;

public class IstLicensePara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
	private String serverName;

	@NotNull(message = "parameter.error.null.message")
	private String serverId;

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

}
