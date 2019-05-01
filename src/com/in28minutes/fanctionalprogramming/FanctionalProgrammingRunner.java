/**
 * @author : Sayaka Tamura
 * Apr 30, 2019
 * Udemy Fanctional Programming
 * https://www.youtube.com/watch?v=aFCNPHfvqEU&feature=youtu.be
 */
package com.in28minutes.fanctionalprogramming;

import java.util.List;

public class FanctionalProgrammingRunner {
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog");

		// printBasic(list);
		printWithFP(list); // the same result as printBasic(list)
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element -" + element)); // Repeat what you'd like to do
																						// here
	}
}
