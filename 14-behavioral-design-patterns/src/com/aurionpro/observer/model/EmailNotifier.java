package com.aurionpro.observer.model;

public class EmailNotifier implements INotifier{
	
Account account;
	
	public EmailNotifier(Account account) {
		this.account = account;
	}
	
	@Override
	public void depositMessage(double amount) {
		// TODO Auto-generated method stub
		System.out.println("EMail: " + amount + " has been deposited to your account");
		System.out.println("New balance: " + account.getBalance());
	}

	@Override
	public void withdrawMessage(double amount) {
		// TODO Auto-generated method stub
		System.out.println("EMail: " + amount + " has been withdrawn from your account");
		System.out.println("New balance: " + account.getBalance());
	}

}
