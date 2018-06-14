package com.abilists.bean.para.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.abilists.bean.para.CommonPara;

import io.utility.validate.annotation.CharacterEscape;

public class UdtSeedKeyPara extends CommonPara {

    @NotNull(message = "parameter.error.null.message")
    @Size(min = 16, max = 16 ,message = "parameter.error.size.max16.message")
    @CharacterEscape(message = "parameter.login.id.seedkey.error.message" )
	private String seedKey;

    @NotNull(message = "parameter.error.null.message")
    @Size(min = 16, max = 16 ,message = "parameter.error.size.max16.message")
    @CharacterEscape(message = "parameter.login.id.seedkey.error.message" )
	private String seedKey2;

	public String getSeedKey() {
		return seedKey;
	}

	public void setSeedKey(String seedKey) {
		this.seedKey = seedKey;
	}

	public String getSeedKey2() {
		return seedKey2;
	}

	public void setSeedKey2(String seedKey2) {
		this.seedKey2 = seedKey2;
	}

}