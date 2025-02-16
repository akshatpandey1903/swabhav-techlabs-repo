package com.aurionpro.model;

public interface Shape {
	
	public void area();
	
	default void display(){
		System.out.println("Inside display");
	}
}
