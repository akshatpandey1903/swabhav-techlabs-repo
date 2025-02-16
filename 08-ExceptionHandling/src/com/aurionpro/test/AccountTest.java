package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.MinimumBalanceException;
import com.aurionpro.exceptions.NegativeAmountException;
import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = null;
		
		while(true){
			System.out.println("Menu:");
			System.out.println("1. Create Account");
			System.out.println("2. Credit Amount");
			System.out.println("3. Debit Amount");
			System.out.println("4. View Balance");
			System.out.println("5. Exit");
			System.out.print("Enter your choice : ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			System.out.println();
			switch(choice){
				case 1:
					if(account == null){
						System.out.print("Enter account number: ");
						String accountNumber = scanner.nextLine();
						System.out.print("Enter Holder's Name: ");
						String name = scanner.nextLine();
						System.out.print("Enter initial balance(min 500.0): ");
						double balance = scanner.nextDouble();
						try{
							account = new Account(accountNumber, name, balance);
						} catch(MinimumBalanceException e){
							System.out.println("Error: " + e.getMessage());
						}
						
					} else {
						System.out.println("Account already exists");
					}
					break;
				case 2:
					if(account != null){
						System.out.print("Enter the amount you want to credit: ");
						double amount = scanner.nextDouble();
						try{
							account.credit(amount);
						} catch(NegativeAmountException exception){
							System.out.println("Error: " + exception.getMessage());
						}
						
					} else {
						System.out.println("Create an account first");
					}
					break;
				case 3:
					if(account != null){
						System.out.print("Enter the amount you want to debit: ");
						double amount = scanner.nextDouble();
						try{
							account.debit(amount);
						} catch(MinimumBalanceException exception){
							System.out.println("error: " + exception.getMessage());
						}
					} else {
						System.out.println("Create an account first");
					}
					break;
				case 4:
					if(account != null){
						System.out.println("Your current balance: " + account.getBalance());
					} else {
						System.out.println("Create an account first");
					}
					break;
				case 5:
					System.out.println("You chose to exit");
					scanner.close();
					return;
				default:
					System.out.println("Enter a valid menu choice");
			}
		}
	}
}
