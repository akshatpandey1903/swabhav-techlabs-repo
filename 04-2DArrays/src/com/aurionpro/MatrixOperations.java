package com.aurionpro;

import java.util.Scanner;

public class MatrixOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of rows and columns for matrix 1 -");
		System.out.print("Rows : ");
		int rowMatrixOne = scanner.nextInt();
		System.out.print("Columns : ");
		int columnMatrixOne = scanner.nextInt();
		
		int[][] matrixOne = new int[rowMatrixOne][columnMatrixOne];
		
		for(int i=0; i<rowMatrixOne; ++i){
			for(int j=0; j<columnMatrixOne; ++j){
				System.out.print("Row[" + (i+1) + "] Column[" + (j+1) + "] Element : ");
				matrixOne[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Rows and Columns for matrix 2 -");
		System.out.print("Rows : ");
		int rowMatrixTwo = scanner.nextInt();
		System.out.print("Columns : ");
		int columnMatrixTwo = scanner.nextInt();
		
		int[][] matrixTwo = new int[rowMatrixTwo][columnMatrixTwo];
		
		for(int i=0; i<rowMatrixTwo; ++i){
			for(int j=0; j<columnMatrixTwo; ++j){
				System.out.print("Row[" + (i+1) + "] Column[" + (j+1) + "] Element : ");
				matrixTwo[i][j] = scanner.nextInt();
			}
		}
		
		
		System.out.println("Enter a choice for Matrix Operation :");
		System.out.println("1 for Matrix Addition");
		System.out.println("2 for Matrix Subtraction");
		System.out.println("3 for Matrix Multiplication");
		System.out.println("4 for Matrix Transpose");
		System.out.print("Enter your choice : ");
		int choice = scanner.nextInt();
		
		if(choice == 1){
			if(rowMatrixOne != rowMatrixTwo || columnMatrixOne != columnMatrixTwo){
				System.out.println("The Matrix sizes do not match for Matrix Addition");
			} else {
				int matrixThree[][] = new int[rowMatrixOne][columnMatrixOne];
				for(int i=0; i<rowMatrixOne; ++i){
					for(int j=0; j<columnMatrixOne; ++j){
						matrixThree[i][j] = matrixOne[i][j] + matrixTwo[i][j];
					}
				}
				System.out.println("Added Matrix is -");
				for(int i=0; i<rowMatrixOne; ++i){
					System.out.print("{");
					for(int j=0; j<columnMatrixOne; ++j){
						System.out.print( + matrixThree[i][j] + " ");
					}
					System.out.print("}");
					System.out.println();
				}
			}
		} else if (choice == 2){
			if(rowMatrixOne != rowMatrixTwo || columnMatrixOne != columnMatrixTwo){
				System.out.println("The Matrix sizes do not match for Matrix Subtraction");
			} else {
				int matrixThree[][] = new int[rowMatrixOne][columnMatrixOne];
				for(int i=0; i<rowMatrixOne; ++i){
					for(int j=0; j<columnMatrixOne; ++j){
						matrixThree[i][j] = matrixOne[i][j] - matrixTwo[i][j];
					}
				}
				System.out.println("Subtracted Matrix is -");
				for(int i=0; i<rowMatrixOne; ++i){
					System.out.print("{");
					for(int j=0; j<columnMatrixOne; ++j){
						System.out.print( + matrixThree[i][j] + " ");
					}
					System.out.print("}");
					System.out.println();
				}
			}
		} else if(choice == 3){
			System.out.println("Currently not implemented");
		} else if(choice == 4){
			System.out.println("Currently not implemented");
		}
		
		scanner.close();
	}
}
