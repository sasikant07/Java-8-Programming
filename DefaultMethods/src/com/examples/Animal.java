package com.examples;

import java.util.ArrayList;
import java.util.List;

public class Animal implements Moveable {

	public static void main(String[] args) {
		List<Animal> list = new ArrayList<Animal>();
		
		list.add(new Animal());
		list.add(new Animal());
		list.add(new Animal());
		
		list.forEach(p -> p.move());
	}

}
