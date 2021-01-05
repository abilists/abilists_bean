package com.abilists.bean.para.login;

import java.util.Date;

import com.abilists.bean.para.LoginPara;

public class LoginSessionPara extends LoginPara {

	// Session Id
	private String ssid;
	// Token from Session
	private String ssToken;
	// Limit Time
	private Date ssTime;
	// void Session
	private String ssDelete;
	
	LoginSessionPara() {		
	}

	public LoginSessionPara(LoginPara loginPara) {
		this.setUserId(loginPara.getUserId());
		this.setUserPwd(loginPara.getUserPwd());
		this.setUserAuth(loginPara.getUserAuth());
		this.setLoginSession(loginPara.getLoginSession());
	}

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getSsToken() {
		return ssToken;
	}

	public void setSsToken(String ssToken) {
		this.ssToken = ssToken;
	}

	public Date getSsTime() {
		return ssTime;
	}

	public void setSsTime(Date ssTime) {
		this.ssTime = ssTime;
	}

	public String getSsDelete() {
		return ssDelete;
	}

	public void setSsDelete(String ssDelete) {
		this.ssDelete = ssDelete;
	}

}
