package com.aurionpro.model;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}

	public void area() {
		System.out.println("Area of circle is : " + (3.14 * radius * radius));	
	}

	
}
