package com.aurionpro;

public class EvenOdd {

	public static void main(String[] args) {
		int number = 5;
		ifEven(number);
	}
	
	private static void ifEven(int number){
		if(number % 2 != 0){
			System.out.println("Odd");
			return;
		}
		System.out.println("Even");
	}

}
