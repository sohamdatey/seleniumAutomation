package com.demo.soham.selAuto.model;

import java.util.List;

public class AddTestResource {

	List<Step> list;

	public List<Step> getList() {
		return list;
	}

	public void setList(List<Step> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "AddTestResource [list=" + list + "]";
	}
	
}
