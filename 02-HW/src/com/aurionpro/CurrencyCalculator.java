package com.aurionpro;

import java.util.Scanner;

public class CurrencyCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the withdrawal amount: ");
		int withdrawalAmount = scanner.nextInt();
		
		int twoThousand = 0;
		int fiveHundred = 0;
		int twoHundred = 0;
		int oneHundred = 0;
		
		if(withdrawalAmount % 100 != 0){
			System.out.println("Can only withdraw amounts which are in multiples of 100");
		} else if(withdrawalAmount > 50000){
			System.out.println("Withdrawal amount cannot exceed 50000");
		}else {
			if(withdrawalAmount >= 2000){
				twoThousand = withdrawalAmount / 2000;
				withdrawalAmount = withdrawalAmount % 2000;
			}
			if(withdrawalAmount >= 500){
				fiveHundred = withdrawalAmount / 500;
				withdrawalAmount = withdrawalAmount % 500;
			}
			if(withdrawalAmount >= 200){
				twoHundred = withdrawalAmount / 200;
				withdrawalAmount = withdrawalAmount % 200;
			}
			if(withdrawalAmount >= 100){
				oneHundred = withdrawalAmount / 100;
				withdrawalAmount = withdrawalAmount % 100;
			}
			System.out.println("Note count : ");
			if(twoThousand > 0){
				System.out.println("Two thousand notes : " + twoThousand);
			}
			if(fiveHundred > 0){
				System.out.println("Five Hundred notes : " + fiveHundred);
			}
			if(twoHundred > 0){
				System.out.println("Two Hundred notes : " + twoHundred);
			}
			if(oneHundred > 0){
				System.out.println("One Hundred notes : " + oneHundred);
			}
		}
	}
}
