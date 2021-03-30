package com.mvcempmgr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDetails {
	private int empid;
	private String empemail;
	private String empname;
	private String emprole;
	private String empdept;
	
	public EmpDetails() {
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpemail() {
		return empemail;
	}
	
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public String getEmpname() {
		return empname;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmprole() {
		return emprole;
	}
	
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	public List<EmpDetails> Displaydetails(String email) throws SQLException {
		List<EmpDetails> emplist = new ArrayList<EmpDetails>();
		Connection con = DbConnect.dbcon();
		PreparedStatement ps = con.prepareStatement("select * from Employee where Empemail=?");
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			EmpDetails emp = new EmpDetails();
			emp.setEmpid(rs.getInt(1));
			emp.setEmpname(rs.getString(2));
			emp.setEmprole(rs.getString(3));
			emp.setEmpdept(rs.getString(4));
			emp.setEmpemail(rs.getString(5));
			emplist.add(emp);
		}			
		return emplist;
	}

}
