package com.aurionpro.solution.model;

public class Robot implements IWorker, RobotWorker{

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("Robot is being charged");
	}

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
	
}
