package com.aurionpro.decorator.model;

public class WheelAlignment extends CarServiceDecorator{
	
	public WheelAlignment(ICarService car) {
		super(car);
	}

	public double getCost() {
		return 1000 + super.getCost();
	}
}
