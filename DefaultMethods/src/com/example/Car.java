package com.example;

public class Car implements Vehicle, FourWheeler {

	@Override
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.super.blowHorn();
		System.out.println("I am a car!");
	}
	
}
