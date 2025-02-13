package com.abilists.bean.para.works;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import base.bean.para.CommonPara;
import io.utility.validate.annotation.UploadFiles;

public class UploadFilePara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String upNo;

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "parameter.error.size.max10.message")
	private String utNo;

	@UploadFiles(message = "parameter.error.null.message")
	private MultipartFile file;

	private String ufKind;

	public String getUpNo() {
		return upNo;
	}

	public void setUpNo(String upNo) {
		this.upNo = upNo;
	}

	public String getUtNo() {
		return utNo;
	}

	public void setUtNo(String utNo) {
		this.utNo = utNo;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getUfKind() {
		return ufKind;
	}

	public void setUfKind(String ufKind) {
		this.ufKind = ufKind;
	}

}