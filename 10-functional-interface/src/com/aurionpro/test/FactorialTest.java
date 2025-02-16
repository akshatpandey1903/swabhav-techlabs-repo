package com.aurionpro.test;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.aurionpro.model.Factorial;

public class FactorialTest {
	public static void main(String[] args) {
		Factorial factorial = (int number)-> {
			int output = 1;
			for(int i=1; i<=number; ++i) {
				output *= i;
			}
			return output;
		};
		
		int result = factorial.fact(5);
		System.out.println("Factorial: " + result);
		
		BiConsumer<Integer, Integer> addition = (number1, number2)->{
			int res=number1 + number2;
			System.out.println("Addition: " + res);
		};
		
		addition.accept(10, 35);
		
		Supplier<Integer> randomNumber = ()->{
			Random random = new Random();
			int output = random.nextInt(900) + 100;
			return output;
		};
		
		System.out.println("Random number: " + randomNumber.get());
		
		Function<Integer, Integer> squareNumber=(number)->{
			int output = number * number;
			return output;
		};
		
		int num = 5;
		System.out.println("Square of " + num + " = " + squareNumber.apply(num));
		
		BiFunction<Integer, Integer, Integer> multiplication = (num1, num2)->{
			int res = num1 * num2;
			return res;
		};
		
		int num1 = 6, num2 = 12;
		System.out.println("Multiplication of " + num1 + " & " + num2 + " is: " + multiplication.apply(num1, num2));
		
		Predicate<Integer> ifEven=(number)->{
			if(number % 2 != 0) {
				return false;
			}
			return true;
		};
		
		int num3 = 891;
		System.out.println("If number " + num3 + " is Even: " + ifEven.test(num3));
		
		BiPredicate<String, String> isSame = (str1, str2)->{
			if(str1.compareTo(str2) != 0) {
				return false;
			}
			return true;
		};
		
		String str1 = "Akshat";
		String str2 = "Pandey";
		System.out.println("If the strings [" + str1 + "] & [" + str2 + "] are same: " + isSame.test(str1, str2) );
	} 
}
