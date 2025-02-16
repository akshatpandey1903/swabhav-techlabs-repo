package com.aurionpro.model;


public class BankAccount {
	
		public String holderName;
		public String accountNumber;
		public String getHolderName() {
			return holderName;
		}

		public void setHolderName(String holderName) {
			this.holderName = holderName;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double balance;
		
		public BankAccount(String accountNumber, String holderName, double balance){
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.holderName = holderName;
		}
		
		public BankAccount(){
			System.out.println("Default Constructor");
		}
		
		public void displayBalance(){
			System.out.println("Your current balance is : " + balance);
		}
		
		public void deposit(double amount){
			if(amount > 0){
				balance += amount;
				System.out.println(amount + " deposited succesfully");
			} else {
				System.out.println("Not a valid deposit amount");
			}
		}
		
		public void withdraw(double amount){
			if(balance >= amount && amount > 0){
				balance -= amount;
				System.out.println(amount + " withdrawn");
			} else if(amount > balance) {
				System.out.println("Not enough balance, Your current balance: " + balance);
			} else {
				System.out.println("Enter a valid withdrawal amount");
			}
		}
}
