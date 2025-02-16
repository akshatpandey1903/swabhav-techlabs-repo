package com.aurionpro.test;

public class InnerTest {
	
	private int a = 10;
	
	public class Nested{
		
		int b;
		public void display() {
			System.out.println(a);
		}
		
	}
	
	public void show() {
		Nested nested = new Nested();
		System.out.println(nested.b);
	}
	
	public static void main(String[] args) {
		InnerTest.Nested inner = new InnerTest().new Nested();
	}
	
}
