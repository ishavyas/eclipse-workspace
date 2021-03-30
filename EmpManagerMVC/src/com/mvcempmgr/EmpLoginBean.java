package com.mvcempmgr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpLoginBean {
	private String email, password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate(String email, String passwd) throws SQLException {
		Connection con = DbConnect.dbcon();
		PreparedStatement ps = con.prepareStatement("select * from Employee where Empemail=? and Emppassword=?");
		ps.setString(1, email);
		ps.setString(2, passwd);
		ResultSet rs = ps.executeQuery();
		boolean status = false;
		if(rs.next())
			status = true;
		return status;
	}

}
