package com.abilists.bean;

import java.util.List;

import com.abilists.bean.model.admin.plugins.MPluginsModel;

import base.bean.model.CommonModel;

public class IndexModel extends CommonModel {

	private List<MPluginsModel> pluginsList;

	public List<MPluginsModel> getPluginsList() {
		return pluginsList;
	}

	public void setPluginsList(List<MPluginsModel> pluginsList) {
		this.pluginsList = pluginsList;
	}

}
