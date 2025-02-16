package com.aurionrpo.test;

import java.util.Map;
import java.util.TreeMap;

import com.aurionpro.model.Student;

public class MapTest {
	public static void main(String[] args) {
		
		Map<Integer, Student> students = new TreeMap<Integer, Student>(); 
		
		students.put(1, new Student(3, "Akshat", 21));
		students.put(3, new Student(1, "Vatsal", 24));
		students.put(2, new Student(2, "Aadit", 19));
		
		for(Map.Entry<Integer, Student> entry : students.entrySet()){
			System.out.print(entry.getKey()+ "-" entry.getValue(getName()));
		}
		
		System.out.println(students);
		
	}
}
