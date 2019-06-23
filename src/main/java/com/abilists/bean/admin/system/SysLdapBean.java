package com.abilists.bean.admin.system;

import org.springframework.stereotype.Component;

@Component
public class SysLdapBean {

	private String ldapEnable;
	private String ldapHost;
	private String ldapPort;
	private String ldapSearchBase;
	private String ldapId;
	private String ldapPassword;

	public String getLdapEnable() {
		return ldapEnable;
	}
	public void setLdapEnable(String ldapEnable) {
		this.ldapEnable = ldapEnable;
	}
	public String getLdapHost() {
		return ldapHost;
	}
	public void setLdapHost(String ldapHost) {
		this.ldapHost = ldapHost;
	}
	public String getLdapPort() {
		return ldapPort;
	}
	public void setLdapPort(String ldapPort) {
		this.ldapPort = ldapPort;
	}
	public String getLdapSearchBase() {
		return ldapSearchBase;
	}
	public void setLdapSearchBase(String ldapSearchBase) {
		this.ldapSearchBase = ldapSearchBase;
	}
	public String getLdapId() {
		return ldapId;
	}
	public void setLdapId(String ldapId) {
		this.ldapId = ldapId;
	}
	public String getLdapPassword() {
		return ldapPassword;
	}
	public void setLdapPassword(String ldapPassword) {
		this.ldapPassword = ldapPassword;
	}

	
}
