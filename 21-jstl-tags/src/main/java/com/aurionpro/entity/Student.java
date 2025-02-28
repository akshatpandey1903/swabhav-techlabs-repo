package com.aurionpro.entity;

public class Student {
	private int studentId;
	private String name;
	private int rollnumber;
	private int age;
	
	public Student(int studentId, String name, int rollnumber, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.rollnumber = rollnumber;
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", rollnumber=" + rollnumber + ", age=" + age
				+ "]";
	}
	
	
}
