/**
 * @author : Sayaka Tamura
 * May 1, 2019
 * Udemy Fanctional Programming
 * https://www.youtube.com/watch?v=aFCNPHfvqEU&feature=youtu.be
 */
package com.in28minutes.fanctionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunnner_Paractice {

	public static void main(String[] args) {
		// Exercise - Print squares of first 10 numbers
		// IntStream.range(1, 11).map(e -> e * e).forEach(p -> System.out.println(p));

		// Map all of these to lowercase and print them
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.toLowerCase()).forEach(p -> System.out.println(p));

		// Print the length of each element using Map operation
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.length())
				.forEach(p -> System.out.println("Word Length : " + p));
	}

}
