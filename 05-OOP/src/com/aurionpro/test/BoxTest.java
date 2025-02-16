package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Box;
import com.aurionpro.model.BoxWeight;

public class BoxTest {
	
	public static class Test{
		private static int count = 0;
		Test(){
			count++;
		}
		public int getCount(){
			return count;
		}
		static
		{
			System.out.println("Calling Static when Test Class is Loaded");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BoxWeight boxWeight1 = new BoxWeight(10.0, 20.0, 50.0, 80.0);
		System.out.println(boxWeight1);
//		Test t1 = new Test();
//		Test t2 = new Test();
//		Test t3 = new Test();
//		
//		System.out.println(t3.getCount());
//		Box b1 = new Box(10.0, 50.0, 25.0);
//		
//		Box[] boxes = new Box[3];
//		
//		for(int i=0; i<boxes.length; i++){
//			boxes[i] = new Box();
//			setDetails(boxes[i], scanner);
//		}
//		int i = 0;
//		for(Box box : boxes){
//			System.out.println("Box " + i + ":");
//			displayDetails(box);
//			i++;
//		}
		
//		setDetails(box1, scanner);
//		setDetails(box2, scanner);
//		setDetails(box3, scanner);
		
//		System.out.println("Box1: ");
//		displayDetails(boxes[0]);
//		
//		System.out.println("Box2: ");
//		displayDetails(box2);
//		
//		System.out.println("Box3: ");
//		displayDetails(box3);
	}
	
	public static void setDetails(Box object, Scanner scanner){
		System.out.println("Enter Height: ");
		object.setHeight(scanner.nextDouble());
		System.out.println("Enter Width: ");
		object.setWidth(scanner.nextDouble());
		System.out.println("Enter Depth: ");
		object.setDepth(scanner.nextDouble());
	}

	public static void displayDetails(Box object){
		System.out.println("Height: " + object.getHeight());
		  System.out.println("Width: " + object.getWidth());
		  System.out.println("Depth: " + object.getDepth());
	}
	
//	static
//	{
//		System.out.println("Calling Static when BoxTest Class is Loaded");
//	}
}
