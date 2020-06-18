package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParrallelStream {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<10;i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.parallelStream();
		
		List<Integer> evenNumberList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(evenNumberList);
		
		//Output : [2, 4, 6, 8]
	}

}
