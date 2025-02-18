package com.aurionpro.model;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public String fuelType() {
        return "Diesel or Petrol";
    }
}
