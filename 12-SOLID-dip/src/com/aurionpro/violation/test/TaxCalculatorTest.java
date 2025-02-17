package com.aurionpro.violation.test;

import com.aurionpro.violation.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator();
		TaxCalculator t2 = new TaxCalculator();
		
		int tax1 = t1.calculateTax(1000, 10);
		System.out.println("Tax for obj1: " + tax1);
		int tax2 = t2.calculateTax(500, 0);
		System.out.println("Tax for obj2: " + tax2);
	}
}
