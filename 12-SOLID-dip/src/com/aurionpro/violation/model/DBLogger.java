package com.aurionpro.violation.model;

public class DBLogger {
	public void log(Exception e) {
		System.err.println(e.getMessage());
	}
}
