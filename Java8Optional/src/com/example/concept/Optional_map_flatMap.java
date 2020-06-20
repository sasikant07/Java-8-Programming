package com.example.concept;

import java.util.Optional;

public class Optional_map_flatMap {

	public static void main(String[] args) {
		
		Optional<String> GOT = Optional.of("Game of Thrones");
		
		Optional<String> nothing = Optional.empty();
		
		System.out.println(GOT.map(String::toLowerCase));
		
		System.out.println(nothing.map(String::toLowerCase));
		
		Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));
		
		System.out.println("Value of Optional object "+anotherOptional);
		
		System.out.println("Optional.map : "+anotherOptional.map(p -> p.map(String::toUpperCase)));
		
		System.out.println("Optional.flatMap : "+anotherOptional.flatMap(p -> p.map(String::toUpperCase)));

	}

}
