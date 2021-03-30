package com.EmployeeManagement;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	String empName;
	Date dateOfBirth;
	String department;
	String Designation;
	double Salary;
	
	public Employee(String name, Date dob, String dept, String role, double sal){
		this.empName = name;
		this.dateOfBirth = dob;
		this.department = dept;
		this.Designation = role;
		this.Salary = sal;
	}
	
	String getName() {
		return empName;
	}
	
	void setName(String name) {
		this.empName = name; 
	}
	
	Date getDate() {
		return dateOfBirth;
		
	}
	
	void setDate(Date dob) {
		this.dateOfBirth = dob;
	}
	
	String getDept() {
		return department;
	}
	
	void setDepartment(String dept) {
		this.department = dept;
	}
	
	String getDesignamtion() {
		return Designation;
	}
	
	void setDesignation(String role) {
		this.Designation = role;
	}
	
	double getSalary() {
		return Salary;
	}
	
	void setSalary(double sal) {
		this.Salary = sal;
	}
	
	public String getDetails() {
		return "Name: "+empName+" Date of Birth: " +dateOfBirth.toString()+ " Department: " +department+ 
				" Designation: " +Designation+ " Salary: " +Salary;
	}
}
