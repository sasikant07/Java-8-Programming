package com.example;

import java.util.Optional;

public class AnotherOptionalIsPresent {

	public static void main(String[] args) {
		String str[] = new String[10];
		
		str[5] = "ANOTHER JAVA OPTIONAL CLASS EXAMPLE";
		
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		checkNull.ifPresent(System.out::println);
		
		System.out.println(checkNull.get());
		
		System.out.println(str[5].toLowerCase());
		
		/*
		 	ANOTHER JAVA OPTIONAL CLASS EXAMPLE
			ANOTHER JAVA OPTIONAL CLASS EXAMPLE
			another java optional class example
		 */
	}

}
