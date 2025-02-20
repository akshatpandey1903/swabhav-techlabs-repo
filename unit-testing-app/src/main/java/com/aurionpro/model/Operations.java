package com.aurionpro.model;

public class Operations {
	
	public int addOperation(int a, int b) {
		return a + b;
	}
	
	public int subtractOperation(int a, int b) {
		return a - b;
	}
	
	public int multiplyOperation(int a, int b) {
		return a * b;
	}
	
	public int divideOperation(int a, int b) {
		return a / b;
	}
	
	public boolean isEven(int number) {
		return number % 2 == 0 ? true : false;
	}
}
