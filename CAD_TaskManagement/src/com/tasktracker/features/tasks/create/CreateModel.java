package com.tasktracker.features.tasks.create;

public class CreateModel {

	private final CreateView view;
	
	public CreateModel(CreateView createview) {
		view = createview;
	}
	void init() {
		System.out.println("create model -" +view);
	}
}
