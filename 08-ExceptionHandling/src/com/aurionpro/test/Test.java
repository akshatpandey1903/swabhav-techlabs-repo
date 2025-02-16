package com.aurionpro.test;

public class Test {
	public static void main(String[] args) {
		
		try{
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			double division = a/b;
			
			System.out.println("Division gives: " + division);
			
		} catch(ArithmeticException e){
			
			System.out.println("Cannot divide by zero");
			
		} catch(Exception e){
			
			System.out.println("Error: " + e.getMessage());
			
		} finally {
			
			System.out.println("Inside finally");
			
		}
		
		System.out.println("Finishing the code");
	}
}
