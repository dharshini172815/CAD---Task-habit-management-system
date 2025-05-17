package com.tasktracker.features.tasks;

public class TaskModel {

	private final TaskView view;
	
	public TaskModel(TaskView taskview) {
		view = taskview;
	}
	void init() {
		System.out.println("task model - " +view);
	}
}
