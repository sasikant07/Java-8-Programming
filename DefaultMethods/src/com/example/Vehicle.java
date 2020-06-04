package com.example;

public interface Vehicle {
	
	default void print() {
		System.out.println("I am a vehicle.");
	}
	
	default void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}
