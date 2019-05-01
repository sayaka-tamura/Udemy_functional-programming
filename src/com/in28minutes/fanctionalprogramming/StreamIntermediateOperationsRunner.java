/**
 * @author : Sayaka Tamura
 * May 1, 2019
 * Udemy Fanctional Programming
 * https://www.youtube.com/watch?v=aFCNPHfvqEU&feature=youtu.be
 */
package com.in28minutes.fanctionalprogramming;

import java.util.List;

public class StreamIntermediateOperationsRunner {

	public static void main(String[] args) {
		List<Integer> nums = List.of(3, 5, 3, 213, 45, 5, 7);
		// Make a sorted list
		// nums.stream().sorted().forEach(e -> System.out.println(e));

		// Make a list that show distinct numbers
		// nums.stream().distinct().forEach(e -> System.out.println(e));

		// Make a sorted list that show distinct numbers
		// nums.stream().sorted().distinct().forEach(e -> System.out.println(e));

		// Make a sorted list from the square of each distinct numbers from <List> num
		nums.stream().sorted().distinct().map(e -> e * e).forEach(e -> System.out.println(e));
	}

}
