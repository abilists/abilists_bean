package com.abilists.enums;

public class DeviceTypeEnums {

	public enum BrowserType {
		NONE("None", "0"),
		DESKTOP("desktop", "1"),
		TABLET("tablet", "2"),
	    MOBILE("mobile", "3");

	    private String name;
	    private String code;

	    private BrowserType(String name, String code) {
	        this.name = name;
	        this.code = code;
	    }

	    public String getName() {
	        return name;
	    }

		public String getCode() {
			return code;
		}

	}

}
