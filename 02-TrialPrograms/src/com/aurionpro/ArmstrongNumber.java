package com.aurionpro;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number to check for Armstrong number : ");
		int number = scanner.nextInt();
		
		int check = 0, temp = number, i = number;
		int j = 0;
		while(i > 0){
			i /= 10;
			j++;
		}
		
		while(temp > 0){
			int remainder = temp % 10;
			check += (int)Math.pow(remainder, j);
			temp /= 10;
		}
		
		if(check == number){
			System.out.println("Number is Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}
}
