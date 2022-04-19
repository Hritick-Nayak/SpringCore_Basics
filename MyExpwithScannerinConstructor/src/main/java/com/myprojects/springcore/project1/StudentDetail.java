package com.myprojects.springcore.project1;

public class StudentDetail {

	private String name, address;
	private int rollNo;
	private long phoneNo;

//	public StudentDetail(String name, String address, int rollNo, long phoneNo) {
//		this.name = name;
//		this.address = address;
//		this.rollNo = rollNo;
//		this.phoneNo = phoneNo;
//	}

	public void studentDetailSetter(String name, String address, int rollNo, long phoneNo) {
		this.name = name;
		this.address = address;
		this.rollNo = rollNo;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", address=" + address + ", rollNo=" + rollNo + ", phoneNo=" + phoneNo
				+ "]";
	}

}
