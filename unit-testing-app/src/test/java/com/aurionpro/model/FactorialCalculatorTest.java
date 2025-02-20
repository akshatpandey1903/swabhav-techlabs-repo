package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialCalculatorTest {
	
	FactorialCalculator calc = new FactorialCalculator();

	@Test
	void testFactorial() {
		int actual = calc.factorial(5);
		
		assertEquals(120, actual);
	}

}
