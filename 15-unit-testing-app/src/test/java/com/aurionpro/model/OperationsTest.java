package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	
	Operations operation;
	
	@BeforeEach
	void init() {
		operation = new Operations();
	}
	
	@Test
	void testAddOperation() {
		int actual = operation.addOperation(20, 10);
		
		assertEquals(30, actual, "Addition operation");
	}

	@Test
	void testSubtractOperation() {
		int actual = operation.subtractOperation(20, 10);
		
		assertEquals(10, actual, "Subtract operation");
	}

	@Test
	void testMultiplyOperation() {
		int actual = operation.multiplyOperation(20, 10);
		
		assertEquals(200, actual, "Multiply operation");
	}

	@Test
	void testDivideOperation() {	
		assertThrows(ArithmeticException.class, () -> {
			operation.divideOperation(20, 0);
		});
	}
	
	@Test
	void testIsEven() {
		assertTrue(operation.isEven(10));
		
		assertFalse(operation.isEven(5));
	}

}
