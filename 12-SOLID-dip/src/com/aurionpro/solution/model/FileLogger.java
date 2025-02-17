package com.aurionpro.solution.model;

public class FileLogger implements ILogger{

	@Override
	public void log(Exception e) {
		// TODO Auto-generated method stub
		System.out.println("Error: " + e.getMessage());
	}
	
}
