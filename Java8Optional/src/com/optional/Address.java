package com.optional;

public class Address {
	public static final Address EMPTY_ADDRESS = new Address("", "", "", "", 0);
	private String houseNum;
	private String streetName;
	private String city;
	private String state;
	private int pincode;
	
	public Address(String houseNum, String streetName, String city, String state, int pincode) {
		this.houseNum = houseNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return state;
	}

	public void setCountry(String country) {
		this.state = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "From Address : houseNum=" + houseNum + ", streetName=" + streetName + ", city=" + city + ", country=" + state
				+ ", pincode=" + pincode;
	}
	
}
