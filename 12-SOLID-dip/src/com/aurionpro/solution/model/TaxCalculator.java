package com.aurionpro.solution.model;


public class TaxCalculator {
	private ILogger logger;
	private int amount;
	private int rate;
	
	public TaxCalculator(ILogger logger) {
		this.logger = logger;
	}
	
	public int calculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount/rate;
			
		} catch (Exception e) {
			logger.log(e);
		}
		return tax;
	}
}