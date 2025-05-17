package com.tasktracker.features.tasks.update;

public class UpdateView {

	private final UpdateModel model;
	
	public UpdateView() {
		model = new UpdateModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("update view - " +model);
	}
}
