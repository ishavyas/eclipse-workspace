package com.empleaveapproval;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
public class AddEmployee extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;	
	public void init(ServletConfig config) {
		con = DbConnect.dbcon();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("EmpID"));
		String name = request.getParameter("EmpName");
		String role = request.getParameter("EmpRole");
		String email = request.getParameter("Empemail");
		String password = request.getParameter("Emppassword");
		String department = request.getParameter("EmpDept");
		
		try {
			ps = con.prepareStatement("insert into Employee(EmpID, EmpName, EmpRole, EmpDept, Empemail, Emppassword) values (?, ?, ?, ?, ? ,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, role);
			ps.setString(4, department);
			ps.setString(5, email);
			ps.setString(6, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int x = ps.executeUpdate();
			if(x!=0)
				response.sendRedirect("loginemployee.html?msg=success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
