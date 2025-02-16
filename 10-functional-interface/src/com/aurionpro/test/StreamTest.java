package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Akshat", "Vatsal", "Aadit", "Mustafa");
		
		names.stream()
		.forEach((name)->{
			name += "AurionPro";
			System.out.println(name);
		});
		
//		List<String> updatedNames = names.stream().map((name)-> name+" BE")
//				.collect(Collectors.toList());
//		
//		updatedNames.stream().forEach((name)-> System.out.println(name));
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evenNumbers = numbers.stream()
				.filter((number)-> number%2==0)
				.collect(Collectors.toList());
		
		evenNumbers.stream()
		.forEach((number)-> System.out.println(number));
		
		int sumOfEven = evenNumbers.stream().reduce(0, (x,y)-> x+y);
		
		System.out.println("Sum of even numbers: " + sumOfEven);
		
	}
}
