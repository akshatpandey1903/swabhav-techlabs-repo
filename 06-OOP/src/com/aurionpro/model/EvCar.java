package com.aurionpro.model;

public class EvCar extends Car{
	private int batteryCapacity;
	private double chargingTime;
	
	public EvCar(String brand, String model) {
		super(brand, model);
	}

	public String toString() {
		return "EvCar [batteryCapacity=" + batteryCapacity + ", chargingTime="
				+ chargingTime + "] for Brand= " + getBrand() + " and Model= " + getModel();
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public double getChargingTime() {
		return chargingTime;
	}

	public void setChargingTime(double chargingTime) {
		this.chargingTime = chargingTime;
	}
	
	public void displayInfo(){
		System.out.println("Display of EvCar: ");
		System.out.println("Brand: " + getBrand());
		System.out.println("Model: " + getModel());
		System.out.println("Number of seats: " + getNumSeats());
		System.out.println("Battery Capacity: " + batteryCapacity);
		System.out.println("Charging Time: " + chargingTime);
	}
	
	public void accelerate(){
		System.out.println("Ev car accelerates quietly");
	}
	
	
}
