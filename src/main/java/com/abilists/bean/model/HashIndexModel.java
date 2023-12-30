package com.abilists.bean.model;

import java.io.Serializable;

import base.bean.model.BasicModel;

public class HashIndexModel extends BasicModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String hiWord;
	private String hiNum;
	private String hiBrief;

	public String getHiWord() {
		return hiWord;
	}
	public void setHiWord(String hiWord) {
		this.hiWord = hiWord;
	}
	public String getHiNum() {
		return hiNum;
	}
	public void setHiNum(String hiNum) {
		this.hiNum = hiNum;
	}
	public String getHiBrief() {
		return hiBrief;
	}
	public void setHiBrief(String hiBrief) {
		this.hiBrief = hiBrief;
	}

}