package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

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
						if(balance < 500.0){
							System.out.println("Initial balance must be atleast 500");
							break;
						}
						System.out.println("Enter the type of account you want:");
						System.out.println("1. Savings Account");
						System.out.println("2. Current Account");
						System.out.print("Enter your choice here: ");
						int type = scanner.nextInt();
						switch(type){
							case 1:
								AccountType accountType = AccountType.savings;
								account = new Account(accountNumber, name, balance, accountType);
								System.out.println("Succefully Created Savings account");
								break;
								
							case 2:
								AccountType accountType2 = AccountType.current;
								account = new Account(accountNumber, name, balance, accountType2);
								System.out.println("Succefully Created Current account");
								break;
						}
						
					} else {
						System.out.println("Account already exists");
					}
					break;
				case 2:
					if(account != null){
						System.out.print("Enter the amount you want to credit: ");
						double amount = scanner.nextDouble();
						account.credit(amount);
					} else {
						System.out.println("Create an account first");
					}
					break;
				case 3:
					if(account != null){
						System.out.print("Enter the amount you want to debit: ");
						double amount = scanner.nextDouble();
						account.debit(amount);
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
