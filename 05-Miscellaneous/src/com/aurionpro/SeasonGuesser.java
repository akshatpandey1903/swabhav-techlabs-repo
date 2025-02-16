package com.aurionpro;

import java.util.Scanner;

public class SeasonGuesser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number from 1 to 12 depicting the seasons : ");
		int choice = scanner.nextInt();
		
		switch(choice){
			case 1:
			case 2:
			case 3:
				System.out.println("This month lies in Winter season");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("SUMMER");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("MONSOON");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("AUTUMN");
				break;
			default:
				System.out.println("Enter a valid month number");
		}
		
		scanner.close();
	}
}
