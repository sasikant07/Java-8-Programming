package com.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringChars {

	public static void main(String[] args) {
		IntStream stream = "123456_abcdefg".chars();
		stream.forEach(p -> System.out.println(p));
		
		/* 
		 	49
			50
			51
			52
			53
			54
			95
			97
			98
			99
			100
			101
			102
			103
		 */
		
		Stream<String> streams = Stream.of("A$B$C".split("\\$"));
		streams.forEach(p -> System.out.println(p));
		/*
		  	A
			B
			C
		 */
	}

}
