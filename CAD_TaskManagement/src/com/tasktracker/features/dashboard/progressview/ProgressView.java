package com.tasktracker.features.dashboard.progressview;

public class ProgressView {

	private final ProgressModel model;
	
	public ProgressView() {
		model = new ProgressModel(this);
	}
	
	public void init( ) {
		model.init();
		System.out.println("progress view - " +model);
	}
}
