package com.aurionpro;

public class TypeCast {
	public static void main(String[] args) {
		//Implicit type cast
		byte number1 = 2;
		short number2 = number1;
		int number3 = number2;
		long number4 = number3;
		float number5 = number4;
		double number6 = number5;
		
		System.out.println("Byte - " + number1);
		System.out.println("short - " + number2);
		System.out.println("int - " + number3);
		System.out.println("long - " + number4);
		System.out.println("float - " + number5);
		System.out.println("double - " + number6);
		
		//Explicit Type cast
		int num1 = 65;
		char c = (char)num1;
		int num2 = 58, num3 = 41;
		char ch = (char)num2, chr = (char)num3;
		System.out.println("58 + 41 gives - " + ch + chr);	
		System.out.println("num1 : " + num1 + " to char is : " + c);
		
	}
}
