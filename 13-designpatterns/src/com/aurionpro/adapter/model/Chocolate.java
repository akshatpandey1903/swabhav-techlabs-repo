package com.aurionpro.adapter.model;

public class Chocolate implements IItem{
	
	private String name;
	private double mrp;
	
	
	
	public Chocolate() {
		super();
	}

	public Chocolate(String name, double mrp) {
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
