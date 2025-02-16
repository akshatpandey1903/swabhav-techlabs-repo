package com.aurionpro.comparators;

import java.util.Comparator;

import com.aurionpro.model.Student;

public class RollNumberComparator implements Comparator<Student>{

	public int compare(Student student1, Student student2) {
		
		return student1.getRollNumber() - student2.getRollNumber();
		
	}
	
}
