package com.aurionrpo.test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.aurionpro.model.Student;

public class SetTest {
	public static void main(String[] args) {
		
		Set<Integer> numberSet = new LinkedHashSet<Integer>();
		
		numberSet.add(20);
		numberSet.add(15);
		numberSet.add(35);
		numberSet.add(41);
		
		System.out.println(numberSet);
		
		Set<Student> students = new TreeSet<Student>();
		
		students.add(new Student(2, "Akshat", 22));
		students.add(new Student(4, "Vatsal", 21));
		students.add(new Student(3, "Mustafa", 23));
		students.add(new Student(1, "Aadit", 22));
		
		System.out.println(students);
		
	}
}
