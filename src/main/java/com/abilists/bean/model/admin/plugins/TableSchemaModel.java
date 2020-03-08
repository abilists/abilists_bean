package com.abilists.bean.model.admin.plugins;

import base.bean.BasicBean;

public class TableSchemaModel extends BasicBean {

	private String tableName;
	private String tableSchema;

	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableSchema() {
		return tableSchema;
	}
	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

}
