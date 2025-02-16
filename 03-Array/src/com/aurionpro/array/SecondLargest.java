package com.aurionpro.array;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int userInput = scanner.nextInt();
		int userArray[] = new int[userInput];
		System.out.println("Enter numbers for the array");
		
		
		for(int i=0; i<userArray.length; ++i){
			userArray[i] = scanner.nextInt();
		}
		
		int max = userArray[0];
		int secondMax = userArray[1];
		for(int i=0; i<userArray.length; ++i){
			if(i != 0 && userArray[i] > secondMax && userArray[i] > max){
				secondMax = max;
			}
			if(userArray[i] > max){
				max = userArray[i];
			}
		}
		System.out.println("Second largest = " + secondMax);
		
	}
}
