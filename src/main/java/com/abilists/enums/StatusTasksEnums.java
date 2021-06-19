package com.abilists.enums;

import java.util.ArrayList;
import java.util.List;

public class StatusTasksEnums {

	public enum TasksStatus {
		NONE("None", "0"),
	    PROGRESSING("Progressing", "1"),
	    HOLDING("Holding", "2"),
	    CANCEL("Cancel", "3"),
//	    DROP("Drop", "4"),
	    COMPLETED("Completed", "7");

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

	public static List<String> getValueList() {
		List<String> allList = new ArrayList<>();

		allList.add(TasksStatus.NONE.getStatus());
		allList.add(TasksStatus.PROGRESSING.getStatus());
		allList.add(TasksStatus.HOLDING.getStatus());
		allList.add(TasksStatus.CANCEL.getStatus());
//		allList.add(TasksStatus.DROP.getStatus()));
		allList.add(TasksStatus.COMPLETED.getStatus());

		return allList;
	}

}