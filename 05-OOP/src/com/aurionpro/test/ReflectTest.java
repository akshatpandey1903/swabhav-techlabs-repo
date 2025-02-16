package com.aurionpro.test;

import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectTest {
	public static void main(String[] args) {
		
		try{
			Class stringClass = Class.forName("java.lang.String");
			
			System.out.println(stringClass.getName());
			System.out.println(stringClass.getSimpleName());
			
			Method []methods = stringClass.getMethods();
			
			for(Method method : methods){
				System.out.println("Method name: " + method.getName() + "..." + method.getParameterCount());
				Parameter[] parameters = method.getParameters();
				for(Parameter parameter : parameters){
					System.out.println("Parameter type: " + parameter.getType()); 
				}
			}
			
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
