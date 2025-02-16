package com.aurionrpo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.comparators.AgeComparator;
import com.aurionpro.comparators.NameComparator;
import com.aurionpro.comparators.RollNumberComparator;
import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of students: ");
		int numberOfStudents = scanner.nextInt();
		
		for(int i=0; i<numberOfStudents; ++i){
			System.out.print("Enter Roll no. for Student[" + (i+1) + "]: ");
			int rollNumber = scanner.nextInt();
			System.out.print("Enter Name of Student[" + (i+1) + "]: ");
			String name = scanner.next();
			System.out.print("Enter Age of Student[" + (i+1) + "]: ");
			int age = scanner.nextInt();
			
			students.add(new Student(rollNumber, name, age));
		}
		
		System.out.println(students);
		
		System.out.println("Sorting by rollNo: ");
		Collections.sort(students, new RollNumberComparator());
		System.out.println(students);
		
		System.out.println("Sorting by Name: ");
		Collections.sort(students, new NameComparator());
		System.out.println(students);
		
		System.out.println("Sorting by age: ");
		Collections.sort(students, new AgeComparator());
		System.out.println(students);
		
		scanner.close();
	}
}
