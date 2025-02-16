package com.aurionpro;

public class SimpleLoops {
	public static void main(String[] args) {
		System.out.println("Using For Loop");
		for(int i=0; i<10; ++i){
			System.out.println(i + 1);
		}
		System.out.println();
		int i = 0;
		System.out.println("Using While Loop");
		while(i < 10){
			System.out.println(i + 1);
			i++;
		}
	}
}
