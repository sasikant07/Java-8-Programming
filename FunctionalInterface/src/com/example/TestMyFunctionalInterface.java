package com.example;

public class TestMyFunctionalInterface {

	public static void main(String[] args) {
		
		MyFunctionalInterface sum = (a,b) -> (a+b);
		
		System.out.println("Result : "+sum.add(10, 20));
		
		System.out.println("Default Method Result : "+sum.addMethod(100, 200));
	}

}
