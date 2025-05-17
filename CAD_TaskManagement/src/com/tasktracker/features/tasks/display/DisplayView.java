package com.tasktracker.features.tasks.display;

public class DisplayView {

	private final DisplayModel model;
	
	public DisplayView() {
		model = new DisplayModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("display view - " +model);
	}
}
