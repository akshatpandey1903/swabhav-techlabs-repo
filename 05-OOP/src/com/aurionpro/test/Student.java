package com.aurionpro.test;

import com.aurionpro.model.StudentDetails;

public class Student {
	public static void main(String[] args) {
		StudentDetails student = new StudentDetails();
//		student.name = "Akshat";
//		student.rollNo = 2021200081;
//		student.marks = 80;
		
//		student.displayDetails();
		student.setName("Akshat");
		student.setRollNo(5);
		student.setMarks(80);
		student.displayDetails();
		
		StudentDetails student2 = new StudentDetails(student);
		student2.displayDetails();
		
	}
}
