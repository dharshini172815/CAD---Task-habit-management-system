package com.tasktracker.features.filter;

public class FilterView {

	private final FilterModel model;
	
	public FilterView() {
		model = new FilterModel(this);
	}
	public void init() {
		model.init();
		System.out.println("filter view - " +model);
	}
}
