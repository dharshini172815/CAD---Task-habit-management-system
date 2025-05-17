package com.tasktracker.features.tasks.update;

public class UpdateModel {

	private final UpdateView view;
	
	public UpdateModel(UpdateView updateview) {
		view = updateview;
	}
	void init() {
		System.out.println("update model -" +view);
	}
}
