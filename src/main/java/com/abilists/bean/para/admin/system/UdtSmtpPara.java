package com.abilists.bean.para.admin.system;

import javax.validation.constraints.Size;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.BitAllowString;
import io.utility.validate.annotation.CharacterEscape;
import io.utility.validate.annotation.IsInteger;

public class UdtSmtpPara extends CommonPara {

    @BitAllowString(message = "parameter.error.bit.message")
	private String smtpStarttlsEnable;

    @BitAllowString(message = "parameter.error.bit.message")
	private String smtpAuthEnable;

    @BitAllowString(message = "parameter.error.bit.message")
    private String smtpEnable;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 100 ,message = "smtpHost must not exceed {max} characters")
	private String smtpHost;

    @IsInteger(message = "parameter.error.integer.message")
    @Size(min = 1, max = 45 ,message = "smtpPort must not exceed {max} characters")
	private String smtpPort;

    @CharacterEscape(message = "parameter.error.escape.character.message")
    @Size(min = 1, max = 100 ,message = "smtpSender must not exceed {max} characters")
	private String smtpSender;

	public String getSmtpStarttlsEnable() {
		return smtpStarttlsEnable;
	}

	public void setSmtpStarttlsEnable(String smtpStarttlsEnable) {
		this.smtpStarttlsEnable = smtpStarttlsEnable;
	}

	public String getSmtpAuthEnable() {
		return smtpAuthEnable;
	}

	public void setSmtpAuthEnable(String smtpAuthEnable) {
		this.smtpAuthEnable = smtpAuthEnable;
	}

	public String getSmtpEnable() {
		return smtpEnable;
	}

	public void setSmtpEnable(String smtpEnable) {
		this.smtpEnable = smtpEnable;
	}

	public String getSmtpHost() {
		return smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public String getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}

	public String getSmtpSender() {
		return smtpSender;
	}

	public void setSmtpSender(String smtpSender) {
		this.smtpSender = smtpSender;
	}

}
