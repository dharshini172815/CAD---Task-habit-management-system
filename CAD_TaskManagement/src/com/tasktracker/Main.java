package com.tasktracker;

import com.tasktracker.features.auth.AuthenticateView;
import com.tasktracker.features.auth.login.LoginView;
import com.tasktracker.features.auth.register.RegisterView;
import com.tasktracker.features.dashboard.DashboardView;
import com.tasktracker.features.dashboard.analyticsview.AnalyticView;
import com.tasktracker.features.dashboard.progressview.ProgressView;
import com.tasktracker.features.filter.FilterView;
import com.tasktracker.features.filter.datefilter.DateFilterView;
import com.tasktracker.features.tasks.create.CreateView;

public class Main {
public static void main(String[] args) {
	new AuthenticateView().init();
	new LoginView().init();
	new RegisterView().init();
	new AnalyticView().init();
	new ProgressView().init();
	new DashboardView().init();
	new DateFilterView().init();
	new FilterView().init();
	new CreateView().init();
}
}
