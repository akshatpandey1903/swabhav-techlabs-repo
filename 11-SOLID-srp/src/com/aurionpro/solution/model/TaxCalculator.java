package com.aurionpro.solution.model;

public class TaxCalculator {
	
	private Invoice invoice;
	
	
	public TaxCalculator(Invoice invoice) {
		super();
		this.invoice = invoice;
	}


	public double calculateTax() {
		double tax = (invoice.getAmount() * Invoice.taxPercent)/100.0;
		return tax;
	}
	
}
