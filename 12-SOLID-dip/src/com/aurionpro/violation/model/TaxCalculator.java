package com.aurionpro.violation.model;

public class TaxCalculator {
	private DBLogger dbLogger = new DBLogger();
	private int amount;
	private int rate;
	
	public TaxCalculator() {

	}
	
	public int calculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount/rate;
			
		} catch (Exception e) {
			dbLogger.log(e);
		}
		return tax;
	}
	
}
