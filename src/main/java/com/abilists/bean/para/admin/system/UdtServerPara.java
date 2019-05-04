package com.abilists.bean.para.admin.system;

import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.CharacterEscape;
import io.utility.validate.annotation.IsInteger;

public class UdtServerPara extends CommonPara {

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 50 ,message = "serverHost must not exceed {max} characters")
	private String msysKind;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 100 ,message = "serverHost must not exceed {max} characters")
	private String serverHost;

    @IsInteger(message = "parameter.error.integer.message")
    @Size(min = 1, max = 45 ,message = "serverPort must not exceed {max} characters")
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
