package com.example.simpleIterating;

import java.util.ArrayList;
import java.util.List;

public class IteratingArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("C");
		list.add("C++");
		list.add("DS");
		list.add("JAVA");
		list.add("SPRING");
		list.add("HIBERNATE");
		list.add("JAVASCRIPT");
		list.add("ANGULAR");
		
		// Using Lambda expression.
		System.out.println("Using Java 8 lambda expression.");
		list.forEach(l -> System.out.println(l));
		
		System.out.println("\n");
		
		// using Java 8 stream
		System.out.println("Using Java 8 stream.");
		list.forEach(System.out:: println);
	}

}
