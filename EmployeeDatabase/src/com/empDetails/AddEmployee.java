package com.empDetails;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/jnitproject";
		String username = "root";
		String password = "root";
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("Name");
		String role = request.getParameter("Role");
		int salary = Integer.parseInt(request.getParameter("Salary"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String department = request.getParameter("Department");
		
		try {
			ps = con.prepareStatement("insert into empDetails(Name, Role, Salary, email, password, Department) values (?, ?, ?, ?, ? ,?)");
			ps.setString(1, name);
			ps.setString(2, role);
			ps.setInt(3, salary);
			ps.setString(4, email);
			ps.setString(5, password);
			ps.setString(6, department);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int x = ps.executeUpdate();
			if(x!=0)
				response.sendRedirect("index.html?msg=success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
