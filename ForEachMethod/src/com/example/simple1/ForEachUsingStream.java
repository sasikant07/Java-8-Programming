package com.example.simple1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachUsingStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		Consumer<Integer> action = System.out::println;
		
		list.stream()
			.filter(n -> n%2 == 0)
			.forEach(action);
	}

}
