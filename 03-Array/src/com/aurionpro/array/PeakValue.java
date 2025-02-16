package com.aurionpro.array;

import java.util.Scanner;

public class PeakValue {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of the array u want : ");
		int userInput = scanner.nextInt();
		int userArray[] = new int[userInput];
		int tempArray[] = new int[userInput];
		System.out.println("Enter numbers for the array");
		for(int i=0; i<userArray.length; ++i){
			userArray[i] = scanner.nextInt();
			tempArray[i] = -1;
		}
		
		for(int i=1; i<userArray.length-1; ++i){
			if(i == 1 && userArray[i] < userArray[i-1]){
				tempArray[i-1] = userArray[i-1];
			}
			if(i == userArray.length - 2 && userArray[i] < userArray[i+1]){
				tempArray[i+1] = userArray[i+1];
			}
			if(userArray[i] > userArray[i-1] && userArray[i] > userArray[i+1]){
				tempArray[i] = userArray[i];
			}
		}
		for(int i=0; i<tempArray.length; ++i){
			if(tempArray[i] != -1){
				System.out.println("Peak : " + tempArray[i]);
			}
		}
	}
}
