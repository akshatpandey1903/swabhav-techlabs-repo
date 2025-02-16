package com.aurionpro.model;

import com.aurionpro.exceptions.MinimumBalanceException;
import com.aurionpro.exceptions.NegativeAmountException;;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	private static double minBalance = 500.0;
	
	public static double getMinBalance() {
		return minBalance;
	}

	public Account(String accountNumber, String name, double balance){
		this.name = name;
		this.accountNumber = accountNumber;
		if(balance < minBalance)
			throw new MinimumBalanceException();
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
	public void credit(double amount){
		if(amount < 0){
			throw new NegativeAmountException(amount);
		}
		balance += amount;
		System.out.println("Amount Credited successfully");
		System.out.println("New Balance: " + balance);
	}
	
	public void debit(double amount){
		if(amount > 0 && balance - amount >= minBalance){
			balance -= amount;
			System.out.println("Amount Debited successfully");
			System.out.println("New Balance: " + balance);
		} else if (balance - amount < minBalance){
			throw new MinimumBalanceException();
		} else {
			System.out.println("Enter a valid amount");
		}
	}
	
	
}
