package com.aurionpro;

import java.util.Scanner;

public class TwoDBasics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns in you wd array :");
		System.out.print("Rows : ");
		int rows = scanner.nextInt();
		System.out.print("Columns : ");
		int columns = scanner.nextInt();
		
		int[][] twoArray = new int[rows][columns];
		
		System.out.println("Enter the elements for the array : ");
		for(int i=0; i<rows; ++i){
			for(int j=0; j<columns; ++j){
				System.out.print("Row : " + (i + 1) + " Column : " + (j + 1) + " Element : ");
				twoArray[i][j] = scanner.nextInt();
			}
		}
		System.out.println("The elments are :");
		for(int i=0; i<twoArray.length; ++i){
			for(int j=0; j<twoArray[i].length; ++j){
				System.out.print(twoArray[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
