package com.aurionpro.observer.exceptions;

public class InsufficientFundsException extends RuntimeException{
	
	public String getMessage(){
		return "Insufficient balance";
	}
}
