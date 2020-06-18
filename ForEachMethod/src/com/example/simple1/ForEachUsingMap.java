package com.example.simple1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachUsingMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		Consumer<Map.Entry<String, Integer>> action = System.out::println;
		map.entrySet().forEach(action);
		
		Consumer<String> actionOnKeys = System.out::println;
		map.keySet().forEach(actionOnKeys);
		
		Consumer<Integer> actionOnValues = System.out::println;
		map.values().forEach(actionOnValues);

	}
	
	/* Output
	 
	 	A=1
		B=2
		C=3
		A
		B
		C
		1
		2
		3
	 
	 */

}
