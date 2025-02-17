package com.aurionpro.solution.model;

public class DBLogger implements ILogger{

	@Override
	public void log(Exception e) {
		// TODO Auto-generated method stub
		System.err.println("Error: " + e.getMessage());
	}
	
}
