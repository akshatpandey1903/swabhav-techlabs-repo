package com.aurionpro.classes;

public class AccountDetails {
	
	public static class Account {
		int accountNumber;
		String accountType;
		String name;
		double balance;
		public Account(){
			
		}
	}
	
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.name = "Akshat";
	}
}
