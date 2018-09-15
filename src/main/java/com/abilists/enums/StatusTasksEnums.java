package com.abilists.enums;

public class StatusTasksEnums {

	public enum TasksStatus {
		NONE("None", "0"),
	    PROGRESSING("Progressing", "1"),
	    HOLDING("Holding", "2"),
	    COMPLETED("Completed", "3");

	    private String name;
	    private String status;

	    private TasksStatus(String name, String status) {
	        this.name = name;
	        this.status = status;
	    }

	    public String getName() {
	        return name;
	    }
	    public String getStatus() {
	        return status;
	    }

	}

}