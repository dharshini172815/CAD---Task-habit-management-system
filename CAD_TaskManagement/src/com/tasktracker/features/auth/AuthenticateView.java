package com.tasktracker.features.auth;

public class AuthenticateView {
private final AuthenticateModel model;

public AuthenticateView() {
	model = new AuthenticateModel(this) ;
}

public void init() {
	model.init();
	System.out.println("Authenticate view - " +model);
}
}
