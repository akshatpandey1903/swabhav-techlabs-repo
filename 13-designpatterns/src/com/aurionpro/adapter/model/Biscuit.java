package com.aurionpro.adapter.model;

public class Biscuit implements IItem{

	private String name;
	private double mrp;
	
	
	
	public Biscuit() {
		super();
	}

	public Biscuit(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String displayName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double displayFinalPrice() {
		// TODO Auto-generated method stub
		return mrp;
	}

}
