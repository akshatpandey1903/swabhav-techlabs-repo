package com.aurionrpo.violation.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot started working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot stopped working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Robot trying to eat");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Robot trying to drink");
	}

}
