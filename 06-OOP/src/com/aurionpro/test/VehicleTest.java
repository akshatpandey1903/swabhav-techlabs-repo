package com.aurionpro.test;

import com.aurionpro.model.Car;
import com.aurionpro.model.EvCar;

public class VehicleTest {
	public static void main(String[] args) {
		EvCar evCar1 = new EvCar("Pagani", "Zonda");
		evCar1.displayInfo();
		//System.out.println(evCar1);
		evCar1.accelerate();
		
		Car car1 = new Car("Lamborghini", "SestoElemento");
		
		car1.displayInfo();
		car1.accelerate();
	}
}
