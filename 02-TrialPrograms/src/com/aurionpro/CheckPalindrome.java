package com.aurionpro;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter the number you want to check for palindrome : ");
		int number = scanner.nextInt();
		
		int newNumber = 0, remainder, temp = number;
		
		while(temp > 0){
			remainder = temp % 10;
			newNumber = newNumber * 10 + remainder;
			temp /= 10;
		}
		if(newNumber == number){
			System.out.println("Entered number is a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
