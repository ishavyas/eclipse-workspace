package com.scheduling;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.scheduling.DbConnect;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddPatient
 */

public class LoginDoctor extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;	
	public void init(ServletConfig config) {
		con = DbConnect.dbcon();
	}
		
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String email = request.getParameter("Dr_email");
		String password = request.getParameter("Dr_password");
				
		try {
			ps = con.prepareStatement("select * from Doctor where Dr_email=? and Dr_password=?");
			ps.setString(1, email );
			ps.setString(2, password);
			ResultSet rs  = ps.executeQuery();
			HttpSession hs = request.getSession();
			if(rs.next()) {
				hs.setAttribute("Dr_ID", rs.getInt(1));
				hs.setAttribute("Dr_email", rs.getString(4));
				response.sendRedirect("doctorprofile.jsp");
			}
			else
				response.sendRedirect("doctorlogin.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
