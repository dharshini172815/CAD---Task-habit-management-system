package com.tasktracker.features.dashboard.progressview;

public class ProgressModel {

	private final ProgressView view;
	
	public ProgressModel(ProgressView progressview) {
		view = progressview;
	}
	
	void init() {
		System.out.println("progress model - " +view);
	}
}
