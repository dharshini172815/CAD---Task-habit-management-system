package com.tasktracker.features.filter.datefilter;

public class DateFilterView {

	private final DateFilterModel model;
	
	public DateFilterView() {
		model = new DateFilterModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("date filter view - " +model);
	}
}
