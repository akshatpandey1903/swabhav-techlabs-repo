package com.aurionpro.decorator.test;

import com.aurionpro.decorator.model.CarInspection;
import com.aurionpro.decorator.model.ICarService;
import com.aurionpro.decorator.model.OilChange;
import com.aurionpro.decorator.model.WheelAlignment;

public class CarTest {
	public static void main(String[] args) {
		ICarService car = new CarInspection();
		OilChange carOil = new OilChange(car);
		WheelAlignment carWheel = new WheelAlignment(carOil);
		
		System.out.println(carOil.getCost());
		System.out.println(carWheel.getCost());
	}
}
