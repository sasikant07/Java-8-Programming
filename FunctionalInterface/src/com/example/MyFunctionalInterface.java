package com.example;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	public int add(int a, int b);
	
	default int addMethod(int a, int b) {
		System.out.println("Inside functional interface default method.");

		return a+b;
	}
}
