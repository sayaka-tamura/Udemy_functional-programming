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
		/** numbers.stream().forEach(element -> System.out.println(element)); */

		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);

		// Regular way to print out the sum of the list
		// int sum = nomalSum(numbers);

		System.out.println(sum);
	}

	private static int nomalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
