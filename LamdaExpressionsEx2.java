package com.java8;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaExpressionsEx2 {
	public static void main(String[] args) {
		Predicate<Integer> predicate = a -> a / 2 == 0;

		System.out.println(predicate.test(3));

		Predicate<String> predicate1 = name -> name.length() >= 6;
		System.out.println(predicate1.test("eating"));

		Function<Integer, Integer> function = i -> i * i;//
		System.out.println(function.apply(2));
	
		BiFunction<Integer, Integer, Integer> bifunction = (a, b) -> a + b;
		System.out.println(bifunction.apply(2,2));
		
		
		String s="welcome";
		Function<String, Integer> f=i->i.length();
		System.out.println(f.apply(s));

	}
}
