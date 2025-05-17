package com.tasktracker.features.dashboard.analyticsview;

public class AnalyticView {

	private final AnalyticsModel model;
	
	public AnalyticView() {
		model = new AnalyticsModel(this) ;
	}
	
	public void init() {
		model.init();
		System.out.println("analytic view - " +model);
	}
}
