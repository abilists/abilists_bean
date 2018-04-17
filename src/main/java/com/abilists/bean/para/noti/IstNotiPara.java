package com.abilists.bean.para.noti;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.abilists.bean.para.CommonPara;

import io.utility.validate.annotation.CharacterEscape;

public class IstNotiPara extends CommonPara {

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 50 ,message = "It is different String size")
	private String notiTitle;

	@CharacterEscape(message = "parameter.error.escape.character.message")
	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 2500, message = "parameter.error.size.max2500.message")
	private String notiContents;

	@NotNull(message = "parameter.error.null.message")
    @Size(min = 1, max = 10 ,message = "It is different String size")
	private String notiKind;

//    @NotNull(message = "notiStart")
//    @Size(min = 9, max = 10 ,message = "It is different String size")
//    @DateFormat(format = "yyyy-MM-dd", message = "Not right format for start of date")
	private String notiStart;

//    @NotNull(message = "notiEnd")
//    @Size(min = 9, max = 10 ,message = "It is different String size")
//    @DateFormat(format = "yyyy-MM-dd", message = "Not right format for end of date")
	private String notiEnd;

	public String getNotiTitle() {
		return notiTitle;
	}

	public void setNotiTitle(String notiTitle) {
		this.notiTitle = notiTitle;
	}

	public String getNotiContents() {
		return notiContents;
	}

	public void setNotiContents(String notiContents) {
		this.notiContents = notiContents;
	}

	public String getNotiKind() {
		return notiKind;
	}

	public void setNotiKind(String notiKind) {
		this.notiKind = notiKind;
	}

	public String getNotiStart() {
		return notiStart;
	}

	public void setNotiStart(String notiStart) {
		this.notiStart = notiStart;
	}

	public String getNotiEnd() {
		return notiEnd;
	}

	public void setNotiEnd(String notiEnd) {
		this.notiEnd = notiEnd;
	}

}
