package com.aurionpro.model;

public class Triangle implements Shape{
	private double base;
	private double height;
	
	
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void area() {
		System.out.println("Area of triangle is : " + (0.5 * base * height));
		
	}
	
}
