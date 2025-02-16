package com.aurionpro.violation.test;

import java.util.Scanner;

import com.aurionpro.violation.model.FestivalType;
import com.aurionpro.violation.model.FixedDeposit;

public class FestivalTest {
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
		
		FestivalType festivalType = selectFestival(scanner);
		
		fixedDeposit = new FixedDeposit(accountNumber, name, principal, duration, festivalType);
		return fixedDeposit;
	}
	
	public static FestivalType selectFestival(Scanner scanner) {
		System.out.println("Festivals: ");
		System.out.println("1. NEW YEAR");
		System.out.println("2. DIWALI");
		System.out.println("3. HOLI");
		System.out.println("4. OTHERS");
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		FestivalType festivalType = null;
		switch(choice) {
		case 1:
			festivalType = festivalType.NEWYEAR;
			break;
		case 2:
			festivalType = festivalType.DIWALI;
			break;
		case 3:
			festivalType = festivalType.HOLI;
			break;
		default:
			festivalType = festivalType.OTHERS;
			break;
		}
		
		return festivalType;
	}
}
