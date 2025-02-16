package com.aurionpro.exceptions;

public class NegativeAmountException extends RuntimeException{
	
	private double amount;
	
	
	public NegativeAmountException(double amount) {
		super();
		this.amount = amount;
	}

	public String getMessage(){
		return "Amount cannot be a negative number, You entered: " + amount;
	}
}
