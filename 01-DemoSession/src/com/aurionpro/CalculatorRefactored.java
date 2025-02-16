package com.aurionpro;

import java.util.*;

public class CalculatorRefactored {
	
	public static double sum(double number1, double number2){
		return number1 + number2;
	}
	
	public static double subtract(double number1, double number2){
		return number1 - number2;
	}
	
	public static double product(double number1, double number2){
		return number1 * number2;
	}
	
	public static double division(double number1, double number2){
		return number1 / number2;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter number 2:");
		double num2 = scanner.nextDouble();
		
		
//		int num1 = Integer.parseInt(args[0]);
//		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("Addition : " + sum(num1, num2));
		System.out.println("Subtraction : " + subtract(num1, num2));
		System.out.println("Product : " + product(num1, num2));
		System.out.println("Division : " + division(num1, num2));
	}
}
