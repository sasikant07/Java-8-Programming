package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListOfStreams {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}

}
