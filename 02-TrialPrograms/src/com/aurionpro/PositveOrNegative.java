package com.aurionpro;

import java.util.*;

public class PositveOrNegative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer to check for +ve or -ve: ");
		int number = scanner.nextInt();
		
		if(number < 0){
			System.out.println("Entered number is negative");
		} else if( number > 0){
			System.out.println("Entered number is positive");
		} else {
			System.out.println("You have entered 0 which is neither");
		}
	}
}
