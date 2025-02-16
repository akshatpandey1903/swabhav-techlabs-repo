package com.aurionpro;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the no. of rows : ");
		int rows = scanner.nextInt();
		
		for(int i=rows; i>0; i--){
			for(int j=i; j>= 1; j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
