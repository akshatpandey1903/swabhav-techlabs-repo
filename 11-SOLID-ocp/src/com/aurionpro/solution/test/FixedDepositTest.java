package com.aurionpro.solution.test;


import java.util.Scanner;

import com.aurionpro.solution.model.DiwaliInterest;
import com.aurionpro.solution.model.FestivalInterest;
import com.aurionpro.solution.model.FixedDeposit;
import com.aurionpro.solution.model.HoliInterest;
import com.aurionpro.solution.model.NewYearInterest;
import com.aurionpro.solution.model.OthersInterest;


public class FixedDepositTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FixedDeposit fixedDeposit = null;
		
		fixedDeposit = getDetails(fixedDeposit, scanner);
		
		double simpleInterest = fixedDeposit.calculateSimpleInterest();
		System.out.println("Simple Interest calculated: " + simpleInterest);
	}
	
	public static FixedDeposit getDetails(FixedDeposit fixedDeposit, Scanner scanner) {
		System.out.print("Enter AccountNumber: ");
		int accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Principal: ");
		double principal = scanner.nextDouble();
		System.out.print("Enter duration for your FD: ");
		int duration = scanner.nextInt();
		
		FestivalInterest festivalInterest = selectFestival(scanner);
		
		fixedDeposit = new FixedDeposit(accountNumber, name, principal, duration, festivalInterest);
		return fixedDeposit;
	}
	
	public static FestivalInterest selectFestival(Scanner scanner) {
		System.out.println("Festivals: ");
		System.out.println("1. NEW YEAR");
		System.out.println("2. DIWALI");
		System.out.println("3. HOLI");
		System.out.println("4. OTHERS");
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			return new NewYearInterest();
			
		case 2:
			return new DiwaliInterest();
			
		case 3:
			return new HoliInterest();
			
		default:
			break;
		}
		
		return new OthersInterest();
	}
}

