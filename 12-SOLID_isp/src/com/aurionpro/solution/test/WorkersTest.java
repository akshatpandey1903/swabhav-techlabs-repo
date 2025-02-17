package com.aurionpro.solution.test;

import com.aurionpro.solution.model.HumanWorker;
import com.aurionpro.solution.model.Labour;
import com.aurionpro.solution.model.Robot;
import com.aurionpro.solution.model.RobotWorker;

public class WorkersTest {
	public static void main(String[] args) {
		HumanWorker labour = new Labour();
		RobotWorker robot = new Robot();
		
		labour.startWork();
		robot.startWork();
		labour.eat();
		robot.charge();
		labour.drink();
		labour.stopWork();
		robot.stopWork();
		
	}
	
}
