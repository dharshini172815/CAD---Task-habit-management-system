package com.tasktracker.features.tasks.display;

public class DisplayModel {

	private final DisplayView view;
	
	public DisplayModel(DisplayView displayview) {
		view = displayview;
	}
	
	void init() {
		System.out.println("display model - " +view);
	}
}
