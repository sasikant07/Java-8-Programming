package com.example.simple;

import java.util.ArrayList;
import java.util.List;

public class ForEachUsingList {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Abhilash", 101));
		list.add(new Student("Nithin", 102));
		list.add(new Student("Naveen", 103));
		list.add(new Student("Kavitha", 104));
		list.add(new Student("Vinod", 105));
		
		list.forEach(System.out:: println);

	}

}
