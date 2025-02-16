package com.aurionpro;

import java.util.*;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number 1 : ");
		int number1 = scanner.nextInt();

		System.out.println("Enter number 2 : ");
		int number2 = scanner.nextInt();

		int number3 = number2;

		number2 = number1;
		number1 = number3;

		System.out.println("Swapped number 1 is now - " + number1);
		System.out.println("Swapped number 2 is now - " + number2);

		System.out.println("Now swapping again without a temp variable");

		number1 = number2 + number1;
		number2 = number1 - number2;
		number1 = number1 - number2;

		System.out.println("Swapped number 1 is now - " + number1);
		System.out.println("Swapped number 2 is now - " + number2);
	}
}
