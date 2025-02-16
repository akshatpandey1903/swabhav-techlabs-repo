package com.aurionpro.callstack;

public class CallstackDebug {
	public static void main(String[] args) {
		System.out.println("Main starts");
		function1();
		System.out.println("Main ends");
	}
	public static void function1(){
		System.out.println("func1 starts");
		function2();
		System.out.println("func1 ends");
	}
	public static void function2(){
		System.out.println("func2 starts");
		function3();
		System.out.println("func2 ends");
	}
	public static void function3(){
		System.out.println("func3 starts");
	}
}
