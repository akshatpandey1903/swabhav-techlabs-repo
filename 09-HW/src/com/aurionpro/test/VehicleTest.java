package com.aurionpro.test;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Car;
import com.aurionpro.model.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike() };

        for (Vehicle v : vehicles) {
            v.start();
            System.out.println("Fuel Type: " + v.fuelType());
            v.stop();
            System.out.println();
        }
    }
}
