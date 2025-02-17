package com.aurionpro.factory.test;

import com.aurionpro.factory.model.ICar;
import com.aurionpro.factory.model.ICarFactory;
import com.aurionpro.factory.model.MahindraFactory;
import com.aurionpro.factory.model.MarutiFactory;
import com.aurionpro.factory.model.TataFactory;

public class CarTest {
	public static void main(String[] args) {
		
		ICarFactory marutiFactory = new MarutiFactory();
		ICarFactory tataFactory = new TataFactory();
		ICarFactory mahindraFactory = new MahindraFactory();
		
		
		ICar maruti1 = marutiFactory.makeCar();
		ICar tata1 = tataFactory.makeCar();
		ICar mahindra1 = mahindraFactory.makeCar();
		
		maruti1.start();
		maruti1.stop();
		System.out.println();
		
		tata1.start();
		tata1.stop();
		System.out.println();
		
		mahindra1.start();
		mahindra1.stop();
		System.out.println();
		
	}
}
