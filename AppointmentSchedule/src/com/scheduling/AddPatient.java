package com.scheduling;

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
 * Servlet implementation class AddPatient
 */

public class AddPatient extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;	
	public void init(ServletConfig config) {
		con = DbConnect.dbcon();
	}
		
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fname = request.getParameter("Patient_FirstName");
		String lname = request.getParameter("Patient_LastName");
		String email = request.getParameter("Patient_email");
		String password = request.getParameter("Patient_password");
		int phone = Integer.parseInt(request.getParameter("Patient_ph"));
		
		try {
			ps = con.prepareStatement("insert into Patient(Patient_FirstName, Patient_LastName, Patient_email, Patient_password, Patient_ph) values (?, ?, ?, ?, ?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email );
			ps.setString(4, password);
			ps.setInt(5, phone);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int x = ps.executeUpdate();
			if(x!=0)
				response.sendRedirect("patientlogin.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
