package com.abilists.bean.para.users;

import org.springframework.web.multipart.MultipartFile;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.UploadFiles;

public class UploadUserFilePara extends CommonPara {

	@UploadFiles(message = "parameter.error.null.message")
	private MultipartFile userImg;

	public MultipartFile getUserImg() {
		return userImg;
	}

	public void setUserImg(MultipartFile userImg) {
		this.userImg = userImg;
	}

}