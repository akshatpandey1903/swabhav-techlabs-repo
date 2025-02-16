package com.aurionrpo.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		Shape circle = new Circle(10.0);
		Shape rectangle = new Rectangle(5.0, 10.0);
		Shape triangle = new Triangle(10.0, 5.0);
		
		circle.area();
		rectangle.area();
		triangle.area();
		
	}
}
