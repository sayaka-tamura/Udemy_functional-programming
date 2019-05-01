/**
 * @author : Sayaka Tamura
 * May 1, 2019
 * Udemy Fanctional Programming
 * https://www.youtube.com/watch?v=aFCNPHfvqEU&feature=youtu.be
 * 
 */
package com.in28minutes.fanctionalprogramming;

import java.util.List;

public class FPNumberRunnner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		// lambda functin to print out each numbers in the list
		// numbers.stream().forEach(element -> System.out.println(element));

		int sum = fpSum(numbers);

		// int sum = nomalSum(numbers);

		System.out.println(sum);
	}

//	// lambda function to print out the sum of even numbers on the list using filter
//	private static int fpSumWithFilter(List<Integer> numbers) {
//		int sum = numbers.stream().filter(number -> number % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
//		return sum;
//	}

	// lambda function to print out the sum of the list
	// Difference from typical procedural programming
	// 1. Functional Programming avoid mutation of variables
	// 2. Focucing on to tell "What to do" inside(reduce elements, start from 0...)
	private static int fpSum(List<Integer> numbers) {
		// reduce():reduce numbers to one result
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
	}

	// Regular way to print out the sum of the list
	// 1. Telling "How to do" inside(initialize value, make a loop...)
	private static int nomalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			// mutation: changing a value while looping
			sum += number;
		}
		return sum;
	}

}
