package com.aurionpro;

import java.util.Scanner;

public class EvenOddChecker {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		int number1 = scanner.nextInt();
		
		if(number1 % 2 == 0){
			System.out.println("Entered number is even");
		} else {
			System.out.println("Entered number is odd");
		}
	}
}
