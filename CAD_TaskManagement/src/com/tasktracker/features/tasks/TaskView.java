package com.tasktracker.features.tasks;

public class TaskView {

	private final TaskModel model;
	
	public TaskView() {
		model = new TaskModel(this);
	}
	public void init() {
		model.init();
		System.out.println("task view - " +model);
	}
}
