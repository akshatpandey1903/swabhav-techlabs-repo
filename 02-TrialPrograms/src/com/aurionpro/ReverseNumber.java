package com.aurionpro;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter the number you want to reverse : ");
		int number = scanner.nextInt();
		
		int newNumber = 0, remainder;
		
		while(number > 0){
			remainder = number % 10;
			newNumber = newNumber * 10 + remainder;
			number /= 10;
		}
		System.out.println("Reversed number : "+ newNumber);
	}
}
