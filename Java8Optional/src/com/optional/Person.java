package com.optional;

import java.util.Optional;

public class Person {
	private String name;
	private Optional<Address> address;
	private int phone;
	
	public Person(String name, Optional<Address> address, int phone) {
		if(name == null) {
			throw new IllegalArgumentException("Null value for name is not permitted."); 
		}
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public void setAddress(Optional<Address> address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
}
