package com.myproject.spring.springcoreadvanced.autowiring.annotationsatfieldlevel;

public class Address {

	private String city, streatNo;
	private int houseNo;

//	public Address(String city, String streatNo, int houseNo) {
//		this.city = city;
//		this.streatNo = streatNo;
//		this.houseNo = houseNo;
//	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreatNo() {
		return streatNo;
	}

	public void setStreatNo(String streatNo) {
		this.streatNo = streatNo;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", streatNo=" + streatNo + ", houseNo=" + houseNo + "]";
	}

}
