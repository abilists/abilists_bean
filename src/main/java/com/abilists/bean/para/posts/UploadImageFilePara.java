package com.abilists.bean.para.posts;

import org.springframework.web.multipart.MultipartFile;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.UploadFiles;

public class UploadImageFilePara extends CommonPara {

	private String ufNo;

	@UploadFiles(message = "parameter.error.null.message")
	private MultipartFile file;

	public String getUfNo() {
		return ufNo;
	}

	public void setUfNo(String ufNo) {
		this.ufNo = ufNo;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}