package com.example.simple;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		// Iterating collection using forEach loop
		
		List<String> list = new ArrayList<String>();
		
		list.add("Abraham Lincon");
		list.add("Mahatma Gandhi");
		list.add("Nelson Mandela");
		list.add("Subhas Chandra Bose");
		list.add("Mother Teresa");
		list.add("Martin Luther King");
		
		
		
		list.forEach(
				(names) -> System.out.println(names)
		);
		
	}

}
