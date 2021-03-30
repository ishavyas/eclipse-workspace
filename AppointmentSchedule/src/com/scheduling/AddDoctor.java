package com.scheduling;

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
 * Servlet implementation class AddDoctor
 */

public class AddDoctor extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;	
	public void init(ServletConfig config) {
		con = DbConnect.dbcon();
	}
		
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fname = request.getParameter("Dr_FirstName");
		String lname = request.getParameter("Dr_LastName");
		String email = request.getParameter("Dr_email");
		String password = request.getParameter("Dr_password");
		int phone = Integer.parseInt(request.getParameter("Dr_ph"));
		String spl = request.getParameter("Dr_Spl");
		
		try {
			ps = con.prepareStatement("insert into Doctor(Dr_FirstName, Dr_LastName, Dr_email, Dr_password, Dr_ph, Dr_Spl) values (?, ?, ?, ?, ?, ?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email );
			ps.setString(4, password);
			ps.setInt(5, phone);
			ps.setString(6, spl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int x = ps.executeUpdate();
			if(x!=0)
				response.sendRedirect("doctorlogin.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
