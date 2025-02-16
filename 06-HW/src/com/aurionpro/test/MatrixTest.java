package com.aurionpro.test;

import java.util.Scanner;

public class MatrixTest {

	public static void main(String[] args) {
		
		int[][] matrix = createMatrix();
		
		System.out.println();
		System.out.println("Matrix: ");
		
		printMatrix(matrix);
		
	}
	
	private static int[][] createMatrix(){
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		for(int i=0; i<matrix.length; ++i){
			readCoulumns(matrix, i, scanner);
		}
		return matrix;
	}
	
	private static void printMatrix(int[][] matrix){
		for(int i=0; i<matrix.length; ++i){
			System.out.print("[");
			printColumns(matrix, i);
			System.out.print("]");
			System.out.println();
		}
	}
	
	private static void printColumns(int matrix[][], int row){
		for(int j=0; j<matrix[row].length; ++j){
			System.out.print(" " + matrix[row][j] + " ");
		}
	}
	
	private static void readCoulumns(int matrix[][], int row, Scanner scanner){
		for(int j=0; j<matrix[row].length; ++j){
			System.out.print("Row[" + (row+1) + "] Column[" + (j+1) + "] Element : ");
			matrix[row][j] = scanner.nextInt();
		}
	}
}
