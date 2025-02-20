package com.aurionpro.strategy.test;

import java.util.Scanner;

import com.aurionpro.strategy.model.AddOperation;
import com.aurionpro.strategy.model.MultiplyOperation;
import com.aurionpro.strategy.model.OperationStrategy;

public class OperationStrategyTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		OperationStrategy operation = new OperationStrategy(new AddOperation());
		
		System.out.println("Enter two numbers to perform addition and multiplication");
		System.out.print("Number 1: ");
		int number1 = scanner.nextInt();
		System.out.print("Number 2: ");
		int number2 = scanner.nextInt();
		
		System.out.println("Addition class operation: " + operation.doOperation(number1, number2));
		
		operation.setOperation(new MultiplyOperation());
		
		System.out.println("Multiplication class operation: " + operation.doOperation(number1, number2));
		
		scanner.close();
	}
}
