package com.aurionpro.factory.model;

public class TataFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		return new Tata();
	}

}
