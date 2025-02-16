package com.aurionpro.exceptions;

public class AgeNotValidException extends RuntimeException{
	
	public String getMessage(){
		return "Age must be over 18";
	}
	
}
