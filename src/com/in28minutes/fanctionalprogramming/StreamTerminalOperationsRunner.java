/**
 * @author : Sayaka Tamura
 * May 1, 2019
 * Udemy Fanctional Programming
 * https://www.youtube.com/watch?v=5Xw1_IREXQs
 */
package com.in28minutes.fanctionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTerminalOperationsRunner {

	public static void main(String[] args) {
		// Get the sum of first 10 Integers, reduce(): Terminal function
		System.out.println("The sum of first 10 integer: " + IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2));
		// Get the maximum number in a list
		System.out.println("Max number in the List: "
				+ List.of(23, 12, 34, 53).stream().max((n1, n2) -> Integer.compare(n1, n2)).get());
		// Get the minimum number in a list
		System.out.println("Min number in the List: "
				+ List.of(23, 12, 34, 53).stream().min((n1, n2) -> Integer.compare(n1, n2)).get());
		// Get only odd numbers in a list
		List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 1).forEach(e -> System.out.println("Odd Number: " + e));

		// Make another list corrected odd numbers from a list
		System.out.println("Odd numbers in the List: "
				+ List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 1).collect(Collectors.toList()));

		// Pick even numbers in to a list
		System.out.println("Even numbers in the List: "
				+ List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));

		// Create a list of squares of the first 10 integers
		// have to convert IntPipeLine to Stream
		System.out.println("List of squares of the first 10 integer: "
				+ IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList()));
	}
}
