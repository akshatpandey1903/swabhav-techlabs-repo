package com.aurionpro.model;


public class StudentDetails {
	
		private String name;
		private int rollNo;
		private int marks;
		
		public StudentDetails() {
			System.out.println("Default :)");
		}

		public StudentDetails(String name, int rollNo, int marks) {
			super();
			this.name = name;
			this.rollNo = rollNo;
			this.marks = marks;
		}
		
		public StudentDetails(StudentDetails other){
			this.name = other.name;
			this.rollNo = other.rollNo;
			this.marks = other.marks;
		}
		
		public void displayDetails(){
			System.out.println("Name : " + name);
			System.out.println("Roll number : " + rollNo);
			System.out.println("Marks : " + marks);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}
}
