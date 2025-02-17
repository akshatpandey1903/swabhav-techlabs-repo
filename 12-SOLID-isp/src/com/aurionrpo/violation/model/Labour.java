package com.aurionrpo.violation.model;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Labour started working");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour stopped working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour is eating now");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour is drinking now");
	}
		
}
