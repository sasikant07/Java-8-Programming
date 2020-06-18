package com.example;

import java.util.ArrayList;
import java.util.List;

public class FilterStreams {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Laxman");
		list.add("AB Devileers");
		list.add("Kohli");
		list.add("Saurav");
		list.add("Rahul");
		list.add("Sachin");
		list.add("Gilchrist");
		list.add("Symonds");
		list.add("Dhoni");

		System.out.println("Filter names starts with S letter : ");
		list.stream().filter((s) -> s.startsWith("S")).forEach(System.out::println);
		
		/* 
		 	Saurav
			Sachin
			Symonds
		 
		 */
		System.out.println();
		
		System.out.println("Sorted names and to upper case : ");
		list.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		/*
		 	AB DEVILEERS
			DHONI
			GILCHRIST
			KOHLI
			LAXMAN
			RAHUL
			SACHIN
			SAURAV
			SYMONDS
		 	
		 */
		
		System.out.println();
		
		System.out.println("Count total names matched with S : ");
		long totalMatched = list.stream().filter((s) -> s.startsWith("S")).count();
		System.out.println(totalMatched);
		
		/*
		  	3
		
		 */
		
		System.out.println();
		
		System.out.println("Any names matched with S : ");
		boolean anymatch = list.stream().anyMatch((s) -> s.startsWith("S"));
		
		System.out.println(anymatch);
		/*
		  		true
		
		 */	
		System.out.println();
		
		System.out.println("First names matched with L : ");
		String firstMatchedNames = list.stream().filter(s -> s.startsWith("S")).findFirst().get();
		
		System.out.println(firstMatchedNames);
		
		/*
		  		Saurav
		
		 */
	}

}
