package com.aurionpro.assignment;

public class Student {
	private int studentId;
	private String name;
	private int mathMarks;
	private int scienceMarks;
	private int englishMarks;
	
	public Student(){
		System.out.println("Object created");
	}
	
	public Student(String name, int studentId){
		this.name = name;
		this.studentId = studentId;
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

	public int calculateTotalMarks(){
		return mathMarks + scienceMarks + englishMarks;
	}
	
	public double calculatePercentage(){
		return (((double)calculateTotalMarks()*100)/300.0);
	}
	
	public void getGrade(){
		double percent = calculatePercentage();
		if(percent >= 85){
			System.out.println("You got an A grade");
		} else if(percent >= 65){
			System.out.println("You got a B grade");
		} else if (percent >= 40){
			System.out.println("You got a C grade");
		} else {
			System.out.println("Fail :(");
		}
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	
}
