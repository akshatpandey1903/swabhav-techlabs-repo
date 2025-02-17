package com.aurionpro.solution.test;

import com.aurionpro.solution.model.DBLogger;
import com.aurionpro.solution.model.FileLogger;
import com.aurionpro.solution.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator(new DBLogger());
		TaxCalculator t2 = new TaxCalculator(new FileLogger());
		
		int tax1 = t1.calculateTax(1000, 10);
		System.out.println("Tax for obj1: " + tax1);
		int tax2 = t2.calculateTax(500, 0);
		System.out.println("Tax for obj2: " + tax2);
		
	}
}
