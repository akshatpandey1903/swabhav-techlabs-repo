package com.aurionpro;

import java.util.Random;
import java.util.Scanner;

public class LuckyDice {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Lets Start Rolling!");
		int currentTotal = 0;
		int i = 1;
		int temporaryTurnValue = 0;
		
		while(currentTotal < 20){
			int turnTotal = 0;
			System.out.println("TURN "+ i);
			
			String diceDecision = "roll";
			
			while(diceDecision.equalsIgnoreCase("roll") || diceDecision.equalsIgnoreCase("r")){
				System.out.print("Do you want to roll or hold ?(R/H) : ");
				diceDecision = scanner.nextLine();
				
				if(diceDecision.equalsIgnoreCase("r") || diceDecision.equalsIgnoreCase("roll")){
					int diceOutput = random.nextInt(6) + 1;
					System.out.println("You got a : " + diceOutput);
					
					if(diceOutput == 1){
						System.out.println("Turn Over :(");
						currentTotal = currentTotal - temporaryTurnValue;
						temporaryTurnValue = 0;
						break;
					}
					
					temporaryTurnValue += diceOutput;
					turnTotal = diceOutput;
					currentTotal += turnTotal;
				}
			}
			if(currentTotal >= 20){
				System.out.println("Turn Total : " + turnTotal);
				System.out.println("Total score : " + currentTotal);
				System.out.println("You finished in "+ i +" turns");
				System.out.println("Game Over!");
				return;
			}
			System.out.println("Turn Total : " + temporaryTurnValue);
			temporaryTurnValue = 0;
			System.out.println("Total score : " + currentTotal);
			i++;
		}
	}
}
