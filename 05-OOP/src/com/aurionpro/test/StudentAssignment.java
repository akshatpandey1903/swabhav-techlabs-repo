package com.aurionpro.test;

import com.aurionpro.assignment.Student;

public class StudentAssignment {
	public static void main(String[] args) {
		Student student1 = new Student("Akshat", 10);
		student1.setMathMarks(88);
		student1.setScienceMarks(85);
		student1.setEnglishMarks(92);
		
		System.out.println("Total marks for " + student1.getName() + " : " + student1.calculateTotalMarks());
		System.out.println("Overall Percentage: " + student1.calculatePercentage());
		student1.getGrade();
		
		Student student2 = new Student("Bala", 11);
		student2.setMathMarks(94);
		student2.setScienceMarks(89);
		student2.setEnglishMarks(93);
		
		System.out.println("Total marks for " + student2.getName() + " : " + student2.calculateTotalMarks());
		System.out.println("Overall Percentage: " + student2.calculatePercentage());
		student2.getGrade();
		
		Student student3 = new Student("Parth", 10);
		student3.setMathMarks(33);
		student3.setScienceMarks(41);
		student3.setEnglishMarks(36);
		
		System.out.println("Total marks for " + student3.getName() + " : " + student3.calculateTotalMarks());
		System.out.println("Overall Percentage: " + student3.calculatePercentage());
		student3.getGrade();
	}
}
