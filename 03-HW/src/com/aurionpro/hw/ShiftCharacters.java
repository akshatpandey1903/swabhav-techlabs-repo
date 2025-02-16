package com.aurionpro.hw;

import java.util.Scanner;

public class ShiftCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Give a string input : ");
		String inputString = scanner.next();
		
		System.out.print("Give an integer to shift the string by : ");
		int shift = scanner.nextInt();
		
		shift = shift % inputString.length();
		
		String frontPart = "";
		for(int i=inputString.length()-1; i>=inputString.length()-shift; --i){
			char tempChar = inputString.charAt(i);
			frontPart = tempChar + frontPart;
		}
		String backPart = "";
		for(int i=0; i<inputString.length()-shift; ++i){
			char tempChar = inputString.charAt(i);
			backPart = backPart + tempChar;
		}
		
		System.out.println("Shifted String is - " + frontPart + backPart);
		
		scanner.close();
	}
}
