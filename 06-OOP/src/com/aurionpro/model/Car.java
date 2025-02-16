package com.aurionpro.model;

public class Car extends Vehicle{
	private String fuelType;
	private int numSeats;
	
	public Car(){
		super();
	}
	
	public Car(String brand, String name) {
		super(brand, name);
	}

	public String toString() {
		return "Car [fuelType=" + fuelType + ", numSeats=" + numSeats + "]";
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	
	public void displayInfo(){
		System.out.println("Display of car: ");
		System.out.println("Brand: " + getBrand());
		System.out.println("Model: " + getModel());
		System.out.println("FuelType: " + fuelType);
		System.out.println("Number of Seats: " + numSeats);
	}
	
	public void accelerate(){
		System.out.println("Vroom Vroom");
	}
	
}
