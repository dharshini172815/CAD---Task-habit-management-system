package com.tasktracker.features.filter.taskfilter;

public class TaskfilterView {

	private final TaskfilterModel model;
	
	public TaskfilterView() {
		model = new TaskfilterModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("task filter view - " +model);
	}
}
