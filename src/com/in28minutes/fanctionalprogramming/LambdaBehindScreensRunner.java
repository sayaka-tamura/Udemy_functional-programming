/**
 * @author : Sayaka Tamura
 * May 1, 2019
 * Udemy Fanctional Programming
 * https://www.youtube.com/watch?v=5Xw1_IREXQs
 */
package com.in28minutes.fanctionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//Create implementation of the predicate interface
class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

public class LambdaBehindScreensRunner {
	// Ctrl + click: move to the method source
	public static void main(String[] args) {
		// 1. Storing functions in variable
		// 2. Passing functions to methods
		// 3. Returning functions from method

		// Print only even numbers from a list
		System.out.println("List 1: ");
		List.of(23, 43, 34, 45, 36, 48).stream().filter(n -> n % 2 == 0).map(n -> n * n)
				.forEach(e -> System.out.println(e));

		// "Inside of filter()": Predicate interface returns true/false
		//
		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t);

		// "Inside of forEach()"
		// Consumer interface consumes a input, does not return anything
		//
		// forEach(Consumer<? super P_OUT> action)
		// void accept(T t);

		// "Inside of .map(n -> n * n)"
		// Function interface takes an input, and gives you output
		//
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);

		System.out.println("List 2: ");
		List.of(23, 43, 34, 45, 36, 48).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper())
				.forEach(new SystemOutConsumer());
	}

}
