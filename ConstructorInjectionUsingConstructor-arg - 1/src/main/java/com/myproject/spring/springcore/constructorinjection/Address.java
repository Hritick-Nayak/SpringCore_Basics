package com.myproject.spring.springcore.constructorinjection;

public class Address {

	private int houseNo;
	private String street, city;

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [ houseNo = " + houseNo + ", street = " + street + ", city = " + city + " ]";
	}

}
