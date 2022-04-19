package com.myproject.spring.springcore.constructorinjection;

public class Employee {

	private String name;
	private int empId;
	private Address address;

	public Employee(String name, int empId, Address address) {
		this.name = name;
		this.empId = empId;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [ name = " + name + ", empId = " + empId + ", address = " + address + " ]";
	}

}
