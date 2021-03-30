package com.empleaveapproval;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginEmployee
 */
public class LoginEmployee extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;	
	public void init(ServletConfig config) {
		con = DbConnect.dbcon();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String email = request.getParameter("Empemail");
		String password = request.getParameter("Emppassword");
			
		try {
			ps = con.prepareStatement("select * from Employee where Empemail=? and Emppassword=?");
			ps.setString(1, email );
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			HttpSession hs = request.getSession();
			if(rs.next()) {
				hs.setAttribute("EmpID", rs.getInt(1));
				hs.setAttribute("Empemail", rs.getString(5));
				response.sendRedirect("empprofile.jsp");
			}
			else
				response.sendRedirect("loginemployee.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
