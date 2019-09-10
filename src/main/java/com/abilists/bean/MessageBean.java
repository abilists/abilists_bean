package com.abilists.bean;

public class MessageBean {

	public static final int OK_REQUEST = 200;
	public static final int PARSE_ERROR = -32700;
	public static final int INVALID_PARAMS = -32602;
	public static final int INVALID_REQUEST = -32600;
	public static final int NOT_FOUND = -32000;
	public static final int DUPLICATE = -32001;
	public static final int SYSTEM_ERROR = -32099;

	private int code;
	private String message;
	private String meaning;
	private String data;

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

}