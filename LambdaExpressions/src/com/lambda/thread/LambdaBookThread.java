package com.lambda.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaBookThread {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		
		list.add(new Book(1, "Ramayan"));
		list.add(new Book(2, "Mahabharat"));
		list.add(new Book(3, "Bhavat Gita"));
		list.add(new Book(4, "Krisnha Puran"));
		list.add(new Book(5, "Vishnu Puran"));
		
		Runnable r1 = () -> list.forEach(Book :: print);
		
		new Thread(r1).start();
		
		Runnable r2 = () -> {
			Consumer<Book> consumer = (Book b) -> System.out.println("Book Id: "+b.getId()+", Book Name: "+b.getName());
			list.forEach(consumer);
		};
		
		new Thread(r2).start();
		
	}

}
