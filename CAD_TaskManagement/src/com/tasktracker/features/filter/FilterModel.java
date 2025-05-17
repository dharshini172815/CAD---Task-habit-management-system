package com.tasktracker.features.filter;

public class FilterModel {

	private final FilterView view;
	
	public FilterModel(FilterView filterview) {
		view = filterview;
	}
	void init() {
		System.out.println("filter model - " +view);
	}
}
