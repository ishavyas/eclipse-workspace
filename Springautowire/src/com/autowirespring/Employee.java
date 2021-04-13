package com.autowirespring;

public class Employee {
	private int empid;
	private String empname;
	private Department dept;	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	/*public Employee(Department dept) {
		this.dept = dept;
	}*/

}
