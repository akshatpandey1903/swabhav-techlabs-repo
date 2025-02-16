package com.aurionpro.model;

public class Vehicle {
	private String brand;
	private String model;
	private double speed;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void displayInfo(){
		System.out.println("Display of vehicle: ");
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
	}
	
}
