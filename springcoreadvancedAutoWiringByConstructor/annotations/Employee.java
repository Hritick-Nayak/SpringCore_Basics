package com.myproject.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	// private String empName;
	// private int empId;
	private Address address;

	public Employee(Address address) {
		this.address = address;
	}

//	public Employee(String empName, int empId, Address address) {
//		this.empName = empName;
//		this.empId = empId;
//		this.address = address;
//	}

//	public String getEmpName() {
//		return empName;
//	}

//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}

//	public int getEmpId() {
//		return empId;
//	}

//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee [empName=" + empName + ", empId=" + empId + "]";
//	}
}
