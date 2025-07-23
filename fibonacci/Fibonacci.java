package com.ajit.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Fibonacci {

	public static void main(String args[]) {
		String str = getHello();
		System.out.println(str);

		List<String> l = getValue();
		System.out.println(l);

		getFibo();
		
		int i = getSumFibonacci();
		System.out.println(i);
	}

	public static String getHello() {
		String s = "Ajit";
		return s;
	}

	public static List<String> getValue() {
		List<String> str = new ArrayList<>();
		str.add("A");
		str.add("B");
		str.add("C");

		return str;

	}

	public static int getSumFibonacci() {
		int sum = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
				.limit(10)
				.map(t -> t[0])
				.mapToInt(Integer::intValue)
				.sum();

		System.out.println("Total : " + sum);
		return sum;

	}

	public static void getFibo() {
		Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
		.limit(10)
		.forEach(x -> System.out.println("{" + x[0] + "," + x[1] + "}"));


	}


}
