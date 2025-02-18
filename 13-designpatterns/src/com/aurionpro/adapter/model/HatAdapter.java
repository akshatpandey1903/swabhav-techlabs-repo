package com.aurionpro.adapter.model;

public class HatAdapter implements IItem{
	
	private Hat hat;

	public HatAdapter(String shortName, String longName, double price, double tax) {
		
		hat = new Hat(shortName, longName, price, tax);
	}

	@Override
	public String displayName() {
		// TODO Auto-generated method stub
		return hat.getName();
	}

	@Override
	public double displayFinalPrice() {
		// TODO Auto-generated method stub
		return hat.getFinalPrice();
	}

}
