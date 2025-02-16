package com.aurionpro;

public class Calculator {
	
	public static int sum(int number1, int number2){
		return number1 + number2;
	}
	
	public static int subtract(int number1, int number2){
		return number1 - number2;
	}
	
	public static int product(int number1, int number2){
		return number1 * number2;
	}
	
	public static double division(double number1, double number2){
		return number1 / number2;
	}
	
	public static void main(String[] args){
		int num1 = 45;
		int num2 = 16;
		
		System.out.println("Addition : " + sum(num1, num2));
		System.out.println("Subtraction : " + subtract(num1, num2));
		System.out.println("Product : " + product(num1, num2));
		System.out.println("Division : " + division(num1, num2));
	}
}
