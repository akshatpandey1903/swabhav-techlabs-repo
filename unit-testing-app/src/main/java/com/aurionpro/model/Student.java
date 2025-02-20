package com.aurionpro.model;

public class Student {
	
	private StudentService service;
	
	public Student(StudentService service) {
		this.service = service;
	}
	
	public double getAverage() {
		return service.getTotalMarks()/service.getNumberOfSubjects();
	}
}
