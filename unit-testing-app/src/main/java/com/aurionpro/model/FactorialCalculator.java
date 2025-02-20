package com.aurionpro.model;

public class FactorialCalculator {
	public int factorial(int num) {
		int output = 1;
		for(int i=1; i<= num; ++i) {
			output *= i;
		}
		return output;
	}
}
