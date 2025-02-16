package com.aurionpro;

public class PrintOddEven {
	public static void main(String[] args) {
		System.out.println("Odd numbers using For loop");
		for(int i=1; i<=100; i+=2){
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Even numbers using While loop");
		int i = 0;
		while(i <= 100){
			System.out.println(i);
			i += 2;
		}
	}
}
