package com.tasktracker.features.dashboard;

public class DashboardModel {

	private final DashboardView view;
	
	public DashboardModel(DashboardView dashboardview) {
		view = dashboardview;
	}
	
	void init() {
		System.out.println("Dashboard model - " +view);
	}
}
