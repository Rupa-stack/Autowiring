package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;



public class Employee 
{
	private int empId;
	private String empName;
	@Autowired
	private Passport passObj;
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empId, String empName, Passport passObj) {
		this.empId = empId;
		this.empName = empName;
		this.passObj = passObj;
	}


	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Passport getPassObj() {
		return passObj;
	}
	
	
	public void setPassObj(Passport passObj) {
		this.passObj = passObj;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", passObj=" + passObj + "]";
	}
	
	
	
	
}
	 	  	    	    	     	      	 	
