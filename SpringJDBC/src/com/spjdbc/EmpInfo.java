package com.spjdbc;

public class EmpInfo {
	private int empid;
	private String empname;
	private int empsal;
	
	public EmpInfo() {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}

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

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	
	public String toString() {
		return empid+" "+empname+" "+empsal;
	}
	
	
	
}
