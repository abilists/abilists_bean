package com.abilists.enums;

public class KindImgEnums {

	public enum KindImg {
		NONE("None", "0"),
	    AVATAR("Avatar", "1"),
	    BG("Bg", "2");

	    private String name;
	    private String kind;

	    private KindImg(String name, String kind) {
	        this.name = name;
	        this.kind = kind;
	    }

	    public String getName() {
	        return name;
	    }

		public String getKind() {
			return kind;
		}

	}

}