package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CircleTest {
	
	@Test
	void testArea() {
		Circle circle = new Circle();
		
		assertEquals(3.14, circle.area(1));
	}
	
}
