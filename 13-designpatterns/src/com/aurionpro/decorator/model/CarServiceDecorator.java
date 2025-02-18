package com.aurionpro.decorator.model;

public abstract class CarServiceDecorator implements ICarService{
	private ICarService carObj;
	
	public CarServiceDecorator(ICarService car) {
		carObj = car;
	}

	@Override
	public double getCost() {
		return carObj.getCost();
	}
}
