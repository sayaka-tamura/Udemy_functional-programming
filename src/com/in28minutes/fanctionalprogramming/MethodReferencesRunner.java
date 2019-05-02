/**
 * @author : Sayaka Tamura
 * May 2, 2019
 * Udemy Fanctional Programming
 * https://www.youtube.com/watch?v=5Xw1_IREXQs
 */
package com.in28minutes.fanctionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	//
	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		// Print each word of the length in a list
		System.out.println("List1");
		List.of("Ant", "Cat", "Bat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println("Word of length in a list: " + s));

		// Used a shortcut for s -> System.out.println(s);
		// System.out.println("List2");
		// List.of("Ant", "Cat", "Bat", "Dog", "Elephant").stream().map(s ->
		// s.length()).forEach(System.out::println);

		// Used print method as above and shortcut for s->s.length()
		System.out.println("List3");
		List.of("Ant", "Cat", "Bat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesRunner::print);

		// Exercise: replace the function with a method reference
		// List.of(23,45,67,34).stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1,
		// n2)).orElse(0);
		System.out.println("Exercise: ");
		Integer max = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner::isEven).max(Integer::compare)
				.orElse(0);
		System.out.println("Max number in a list: " + max);

	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

}
