package com.aurionpro.test;

import com.aurionpro.model.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape circle =()-> System.out.println("Area of a circle");
		calcArea(circle);
		
		Shape triangle =()-> {
			int height = 10;
			int base = 5;
			System.out.println("Area of Triangle: " + 0.5 * height * base);
		};
		
		calcArea(triangle);
		
	}
	
	public static void calcArea(Shape shape) {
		shape.area();
	}
}
