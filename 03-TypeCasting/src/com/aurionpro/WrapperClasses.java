package com.aurionpro;

public class WrapperClasses {
	public static void main(String[] args) {
		int number = 5;
		Integer obj = Integer.valueOf(number); 
		System.out.println(number + " : " + obj);
		String str = "1234";
		Integer number2 = Integer.parseInt(str);
		
		Integer object = 123;
		String st = object.toString();
		System.out.println(st);
		
		
	}
}
