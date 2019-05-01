/**
 * @author : Sayaka Tamura
 * May 1, 2019
 * Udemy Fanctional Programming
 * https://www.youtube.com/watch?v=5Xw1_IREXQs
 */
package com.in28minutes.fanctionalprogramming;

import java.util.List;

public class OptionalClassRunner {

	public static void main(String[] args) {
		// Can use isPresent() instead of get()
		System.out.println("Maximum Even Number: " + List.of(22, 45, 67, 12).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).get());
		// Check if an even number presents
		System.out.println("Maximum Even Number: " + List.of(23, 45, 67).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).isPresent());

		// Put if an even number does not present, put zero instead of null pointer
		System.out.println("Maximum Even Number: " + List.of(23, 45, 67).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0));

		System.out.println("Maximum Even Number: " + List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0));
	}

}
