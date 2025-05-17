package com.tasktracker.features.dashboard.analyticsview;

public class AnalyticsModel {

	private final AnalyticView view;
	
	public AnalyticsModel(AnalyticView analyticview) {
		view = analyticview;
	}
	
	void init() {
		System.out.println("analytics model - " +view);
	}
}
