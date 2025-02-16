package com.aurionpro.violation.model;

public class Invoice {
	private int id;
	private String description;
	private double amount;
	private static double taxPercent = 5.0;
	
	public Invoice() {
		super();
	}

	public Invoice(int id, String description, double amount) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTax() {
		return taxPercent;
	}
	
	public double calculateTax() {
		double tax = (this.amount * taxPercent)/100.0;
		return tax;
	}
	
	public void printInvoice() {
		System.out.println("ID: " + id +" | Description: " + description);
		System.out.println("---------------------");
		System.out.println("Amount : " + this.amount);
		System.out.println("Tax %  : " + taxPercent);
		double taxAmount = calculateTax();
		System.out.println("Tax amount :" + taxAmount);
		System.out.println("---------------------");
		System.out.println("Total amount: " + (taxAmount + amount));
	}
}
