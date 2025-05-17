package com.tasktracker.features.filter.datefilter;

public class DateFilterModel {

	private final DateFilterView view;
	public DateFilterModel(DateFilterView datefilterview) {
		view = datefilterview;
	}
	void init() {
		System.out.println("Date filter model - " +view);
	}
}
