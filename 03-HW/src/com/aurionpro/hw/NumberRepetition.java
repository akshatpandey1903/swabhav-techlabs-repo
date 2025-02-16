package com.aurionpro.hw;

import java.util.Scanner;

public class NumberRepetition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of the array you want : ");
		int arraySize = scanner.nextInt();
		System.out.println("Enter the elements of the array ");
		int userArray[] = new int[arraySize];
		for(int i=0; i<arraySize; i++){
			System.out.print("Element " + (i + 1) + " : ");
			userArray[i] = scanner.nextInt();
		}
		
		System.out.print("Enter the integer you want the frequency of : ");
		int numberToFind = scanner.nextInt();
		int numberCount = 0;
		
		for(int i=0; i<arraySize; ++i){
			if(userArray[i] == numberToFind){
				numberCount++;
			}
		}
		
		System.out.println("The integer " + numberToFind + " appears in the array " + numberCount + " times");
		
		scanner.close();
	}
}
