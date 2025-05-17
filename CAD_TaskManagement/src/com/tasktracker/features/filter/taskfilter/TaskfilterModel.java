package com.tasktracker.features.filter.taskfilter;

public class TaskfilterModel {

	private final TaskfilterView view;
	
	public TaskfilterModel(TaskfilterView taskfilterview) {
		view = taskfilterview;
	}
	void init() {
		System.out.println("task filter model - " +view);
	}
}
