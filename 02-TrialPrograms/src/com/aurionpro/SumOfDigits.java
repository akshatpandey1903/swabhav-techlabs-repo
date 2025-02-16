package com.aurionpro;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to calculate sum of digits : ");
		int number = scanner.nextInt();
		
		int newNumber = 0;
		
		while(number > 0){
			int temp = number % 10;
			newNumber = newNumber + temp;
			number /= 10;
		}
		
		System.out.println("Sum of digits is : " + newNumber);
	}
}
