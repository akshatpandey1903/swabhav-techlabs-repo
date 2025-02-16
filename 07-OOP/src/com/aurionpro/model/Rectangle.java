package com.aurionpro.model;

public class Rectangle implements Shape {
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {
		System.out.println("Area of rectangle is : " + (length * breadth));
	}
	
	
}
