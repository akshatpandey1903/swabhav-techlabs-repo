package com.aurionpro.array;

import java.util.Scanner;

public class ArrayInit {
	public static void main(String[] args) {
		int[] array = new int[5];
		int[] arr = {1,2,3,4,5};
		
		//
		
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		int userArray[] = new int[userInput];
		System.out.println("Enter numbers for the array");
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<userArray.length; ++i){
			userArray[i] = scanner.nextInt();
		}
		for(int i=0; i<userArray.length; ++i){
			if(userArray[i] > max){
				max = userArray[i];
			}
		}
		System.out.println("Maximum element : " + max);
	}
}
