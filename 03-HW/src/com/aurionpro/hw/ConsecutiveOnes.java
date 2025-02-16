package com.aurionpro.hw;

import java.util.Scanner;

public class ConsecutiveOnes {
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
		
		int onesCount = 0;
		int maxCount = 0;
		
		for(int i=0; i<userArray.length; ++i){
			if(userArray[i] == 1){
				onesCount++;
			} else {
				onesCount = 0;
			}
			if(onesCount > maxCount){
				maxCount = onesCount;
			}
		}
		
		System.out.println("The maximum number of consecutive ones is : " + maxCount);
		
		scanner.close();
	}
}
