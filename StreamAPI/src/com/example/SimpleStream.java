package com.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleStream {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("Charlie");
		names.add("Douglas");
		names.add("Sundaram");
		names.add("Charlie");
		names.add("Yuki");
		
		names.stream().distinct().forEach(System.out::println);
	}

}
