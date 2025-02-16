package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccount;

public class AccountDetails {

		public static void main(String[] args) {
			//BankAccount acc1 = new BankAccount("221100", "Akshat Pandey", 1000.0);
			
//			acc1.displayBalance();
//			acc1.deposit(200);
//			acc1.withdraw(1300);
//			acc1.withdraw(300);
//			acc1.displayBalance();
			
			BankAccount account = new BankAccount();
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the name of the account holder: ");
			String holderName = scanner.nextLine();
			System.out.print("Enter your Account Number: ");
			String accountNumber = scanner.nextLine();
			System.out.print("Enter the current balance: ");
			double balance = scanner.nextDouble();
			
			account.setAccountNumber(accountNumber);
			account.setBalance(balance);
			account.setHolderName(holderName);
			
			System.out.println("Details and Methods : ");
			account.displayBalance();
			account.deposit(500);
			account.withdraw(2000);
			account.withdraw(600);
			account.displayBalance();
			
			BankAccount account2 = new BankAccount("221100", "Ak P", 500.0);
			System.out.println("Details and Methods : ");
			account2.displayBalance();
			account2.deposit(500);
			account2.withdraw(2000);
			account2.withdraw(600);
			account2.displayBalance();
			
			scanner.close();
		}
		
}
