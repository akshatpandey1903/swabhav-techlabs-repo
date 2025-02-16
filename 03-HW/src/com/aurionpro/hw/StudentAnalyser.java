package com.aurionpro.hw;

import java.util.Scanner;

public class StudentAnalyser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of subjects you want to enter the marks for : ");
		int numberOfSubjects = scanner.nextInt();
		
		int[] arrayOfMarks = new int[numberOfSubjects];
		for(int i=0; i<numberOfSubjects; ++i){
			System.out.print("Subject " + (i + 1) + " : ");
			arrayOfMarks[i] = scanner.nextInt();
		}
		
		int maximumMarks = -1, minimumMarks = 999, sumOfMarks = 0;
		for(int i=0; i<arrayOfMarks.length; ++i){
			sumOfMarks += arrayOfMarks[i];
			if(arrayOfMarks[i] > maximumMarks){
				maximumMarks = arrayOfMarks[i];
			}
			if(arrayOfMarks[i] < minimumMarks){
				minimumMarks = arrayOfMarks[i];
			}
		}
		
		float averageMarks = sumOfMarks/numberOfSubjects;
		System.out.println("Highest marks received : " + maximumMarks);
		System.out.println("Lowest marks received : " + minimumMarks);
		System.out.println("Average marks received : " + averageMarks);
		
		scanner.close();
	}
}
