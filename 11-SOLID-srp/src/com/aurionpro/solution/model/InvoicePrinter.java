package com.aurionpro.solution.model;

public class InvoicePrinter {
	
	private Invoice invoice;
	private TaxCalculator taxCalculator;
	
	
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}


	public void printInvoice() {
		System.out.println("ID: " + invoice.getId() +" | Description: " + invoice.getDescription());
		System.out.println("---------------------");
		System.out.println("Amount : " + invoice.getAmount());
		System.out.println("Tax %  : " + Invoice.taxPercent);
		double taxAmount = taxCalculator.calculateTax();
		System.out.println("Tax amount :" + taxAmount);
		System.out.println("---------------------");
		System.out.println("Total amount: " + (taxAmount + invoice.getAmount()));
	}
}
