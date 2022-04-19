package com.myproject.spring.springcoreadvanced.autowiring.qualifierannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	// private String empName;
	// private int empId;
	@Autowired(required = false) // As field level and required false means if no value found in bean specified
									// in qualifier it will give null value
//	@Qualifier("address123") or
	@Qualifier("addressXXX")
	private Address address;

//	public Employee(Address address) {
//		this.address = address;
//	}

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

//	public void setAddress(Address address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee [empName=" + empName + ", empId=" + empId + "]";
//	}
}
