package com.aurionpro.adapter.model;

public class Hat{
	
	private String shortName;
	private String longName;
	private double price;
	private double tax;
	
	public Hat() {

	}

	public Hat(String shortName, String longName, double price, double tax) {
		this.shortName = shortName;
		this.longName = longName;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return shortName + " : " + longName;
	}

	public double getFinalPrice() {
		// TODO Auto-generated method stub
		double taxRate = (price*tax)/100.0;
		double newPrice = price + taxRate;
		return newPrice;
	}

}
