package com.scheduling;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
 * Servlet implementation class AddPatient
 */

public class LoginPatient extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;	
	public void init(ServletConfig config) {
		con = DbConnect.dbcon();
	}		
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String email = request.getParameter("Patient_email");
		String password = request.getParameter("Patient_password");
			
		try {
			ps = con.prepareStatement("select * from Patient where Patient_email=? and Patient_password=?");
			ps.setString(1, email );
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			HttpSession hs = request.getSession();
			if(rs.next()) {
				hs.setAttribute("Patient_ID", rs.getInt(1));
				hs.setAttribute("Patient_email", rs.getString(4));
				response.sendRedirect("patienthome.html");
			}
			else
				response.sendRedirect("patientlogin.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
