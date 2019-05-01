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
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		List<Integer> list_num = List.of(1, 4, 7, 9);

		// printStringBasic(list);

		// the same result as printBasic(list)
		// printStringWithFP(list);

		// printStringWithFiltering(list);
		// printWithFPWithFiltering(list);
		// printEvenNumWithFiltering(list_num);
		// printOddNumWithFiltering(list_num);
		// printOddNumWithFPWithFiltering(list_num);
		printEvenNumWithFPWithFiltering(list_num);
	}

	// print a list in a basic way
	private static void printStringBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	// Print a String list with filtering
	private static void printStringWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	// Print Even Numbers
	private static void printOddNumWithFiltering(List<Integer> list_num) {
		for (int num : list_num) {
			if (num % 2 == 1) {
				System.out.println(num);
			}
		}
	}

	// Print Odd Numbers
	private static void printEvenNumWithFiltering(List<Integer> list_num) {
		for (int num : list_num) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

	// print a String list using lambda function
	// lambda function: shortcut for creating a function
	private static void printStringWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element -" + element));
	}

	// Print a String list with filtering and lambda function
	private static void printWithFPWithFiltering(List<String> list) {
		// the same as "string.endsWith("at") in printStringWithFiltering method"
		// Repeat what you'd like to do in forEach()
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element -" + element));
	}

	// Print Even Numbers using lambda function
	private static void printOddNumWithFPWithFiltering(List<Integer> list_num) {
		// stream(): source of objects(going to have intermediate/terminal operations)

		// filter(): intermediate operation-> output of intermediate operation is
		// another stream

		// ForEach(): terminal operation -> output of terminal operation is either to
		// consume the entire stream or to return one result back
		list_num.stream().filter(element -> element % 2 == 1)
				.forEach(element -> System.out.println("Odd element -" + element));
	}

	// Print Odd Numbers using lambda function
	private static void printEvenNumWithFPWithFiltering(List<Integer> list_num) {
		list_num.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("Even element -" + element));
	}

}
