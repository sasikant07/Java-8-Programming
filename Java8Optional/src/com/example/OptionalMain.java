package com.example;

import java.util.Optional;

public class OptionalMain {

	public static void main(String[] args) {
		String str[] =  new String[10];
		
		//Using without Optional class
		System.out.println("==== Without using Optional ====");
		String strng = str[5].toLowerCase();  
		System.out.println(strng);
		
		/*
		 	Output:-
		 	===== Without using Optional ======
		 	Exception in thread "main" java.lang.NullPointerException
			at com.example.OptionalMain.main(OptionalMain.java:11)
		 */
		
		System.out.println();
		
		//Using Optional class
		System.out.println("==== With using Optional class ====");
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			String word = str[5].toLowerCase();
			System.out.println(word);
		} else {
			System.out.println("String is null.");
		}
		
		/*
	 	Output:-
	 	==== With using Optional class ====
	 	String is null.
	 */
	}

}
