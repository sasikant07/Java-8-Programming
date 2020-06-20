package com.example.concept;

import java.util.Optional;

public class Optional_OrElse_OrElseGet {

	public static void main(String[] args) {
		
		Optional<String> GOT = Optional.of("Game of Thrones");
		
		Optional<String> nothing = Optional.empty();
		
		
		System.out.println(GOT.orElse("Default Value."));
		System.out.println(nothing.orElse("Default Values."));
		
		System.out.println(GOT.orElseGet(() -> "Default value"));
		System.out.println(nothing.orElseGet(() -> "Default Values"));

	}

}
