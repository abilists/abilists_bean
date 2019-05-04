package com.abilists.bean.para.admin.system;

import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;

public class UdtServerPara extends CommonPara {

	private String msysKind;

	@CharacterEscape(message = "parameter.error.escape.password.message")
    @Size(min = 1, max = 100 ,message = "serverHost must not exceed {max} characters")
	private String serverHost;

	@CharacterEscape(message = "parameter.error.integer.message")
    @Size(min = 1, max = 10 ,message = "serverPort must not exceed {max} characters")
	private String serverPort;

	public String getMsysKind() {
		return msysKind;
	}

	public void setMsysKind(String msysKind) {
		this.msysKind = msysKind;
	}

	public String getServerHost() {
		return serverHost;
	}

	public void setServerHost(String serverHost) {
		this.serverHost = serverHost;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

}
