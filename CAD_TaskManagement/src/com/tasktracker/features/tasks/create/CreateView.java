package com.tasktracker.features.tasks.create;

public class CreateView {

	private final CreateModel model;
	
	public CreateView() {
		model = new CreateModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("create view - " +model);
	}
}
