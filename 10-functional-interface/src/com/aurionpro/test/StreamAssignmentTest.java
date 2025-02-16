package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssignmentTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayesh", "Nimesh", "Mark", "Mahesh", "Ramesh");
		
		List<String> firstThreeSorted = names
				.stream()
				.limit(3)
				.sorted()
				.collect(Collectors.toList());
		
		firstThreeSorted.stream()
		.forEach((name)->System.out.println(name));
		
		System.out.println();
		
		List<String> firstThreeWithA = names.stream()
				.limit(3)
				.sorted()
				.filter((name)->name.contains("a"))
				.collect(Collectors.toList());
		
		firstThreeWithA.stream()
		.forEach((name)->System.out.println(name));
		
		System.out.println();
		
		List<String> descendingOrder = names.stream()
				.sorted((o1,o2)->o2.compareTo(o1))
				.collect(Collectors.toList());
		
		descendingOrder.stream()
		.forEach((name)-> System.out.println(name));
		
		System.out.println();
		
		List<String> threeCharacters = names.stream()
				.map((name)-> name=name.substring(0, 3))
				.collect(Collectors.toList());
		
		threeCharacters.stream()
		.forEach((name)-> System.out.println(name));
		
		System.out.println();
		
		List<String> fourCharacters = names.stream()
				.filter((name)->name.length()<=4)
				.collect(Collectors.toList());
		
		fourCharacters.stream()
		.forEach((name)-> System.out.println(name));
	}
}
