/**
 * @author : Sayaka Tamura
 * May 1, 2019
 * Udemy Fanctional Programming
 * https://www.youtube.com/watch?v=5Xw1_IREXQs
 */
package com.in28minutes.fanctionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class StreamTerminalOperationsRunner {

	public static void main(String[] args) {
		// Get the sum of first 10 Integers, reduce(): Terminal function
		System.out.println("The sum of first 10 integer: " + IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2));
		// Get the maximum number in a list
		System.out.println("Max number is the List: "
				+ List.of(23, 12, 34, 53).stream().max((n1, n2) -> Integer.compare(n1, n2)).get());
	}
}
