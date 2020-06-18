package com.example;

import java.util.Optional;

public class OptionalIsPresent {

	public static void main(String[] args) {
		String str[] = new String[10];
		
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		if(checkNull.isPresent()) {
			String lowerCase = str[5].toLowerCase();
			System.out.println(lowerCase);
		} else {
			System.out.println("string value is not present.");
		}
		
		// Output: java optional class example
	}

}
