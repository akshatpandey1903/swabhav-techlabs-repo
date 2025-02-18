package com.aurionpro.decorator.model;

public class CarInspection implements ICarService{

	private double price = 1500;
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return price;
	}
	
}
