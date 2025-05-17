package com.tasktracker.features.dashboard;

public class DashboardView {

	private final DashboardModel model;
	
	public DashboardView() {
		model = new DashboardModel(this);
	}
	public void init() {
		model.init();
		System.out.println("dashboard view = " +model);
	}
}
