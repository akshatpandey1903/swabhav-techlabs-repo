package com.aurionpro.observer.test;

import java.util.Scanner;

import com.aurionpro.observer.exceptions.InsufficientFundsException;
import com.aurionpro.observer.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account("123", "Akshat", 500.0);
		
		choose(scanner, account);
		
		System.out.println();
		
		account.deposit(200);
		
		System.out.println();
		
		try {
			account.withdraw(300);
		} catch(InsufficientFundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();
		
		try {
			account.withdraw(800);
		} catch(InsufficientFundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void choose(Scanner scanner, Account account) {
		boolean sms = false;
		boolean whatsapp = false;
		boolean email = false;
		while(true) {
		System.out.println("Choose a notifier");
		System.out.println("1. SMS");
		System.out.println("2. WhatsApp");
		System.out.println("3. EMail");
		System.out.println("4. Exit");
		System.out.print("Enter your option: ");
		int choice = scanner.nextInt();
		switch(choice) {
			case 1:
				if(sms) {
					System.out.println("already added");
					break;
				}
				account.registerNotifier("sms", account);
				System.out.println("Success");
			break;
			case 2:
				if(whatsapp) {
					System.out.println("already added");
					break;
				}
				account.registerNotifier("whatsapp", account);
				System.out.println("Success");
			break;
			case 3:
				if(email) {
					System.out.println("already added");
					break;
				}
				account.registerNotifier("email", account);
				System.out.println("Success");
			break;
			case 4:
				return;
			default:
				System.out.println("Enter correct option");
			break;
		}
		}
	}
}
