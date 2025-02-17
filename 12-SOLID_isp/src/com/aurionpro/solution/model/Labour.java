package com.aurionpro.solution.model;

public class Labour implements HumanWorker{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour is eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour is drinking");
	}

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour started working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour stopped working");
	}
	
}
