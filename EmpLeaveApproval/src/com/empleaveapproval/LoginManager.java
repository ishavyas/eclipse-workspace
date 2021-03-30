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
 * Servlet implementation class LoginManager
 */

public class LoginManager extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;	
	public void init(ServletConfig config) {
		con = DbConnect.dbcon();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String emailid = request.getParameter("Mgremail");
		String paswd = request.getParameter("Mgrpassword");
			
		try {
			ps = con.prepareStatement("select * from Manager where Mgremail=? and Mgrpassword=?");
			ps.setString(1, emailid );
			ps.setString(2, paswd);
			ResultSet rs = ps.executeQuery();
			HttpSession hs = request.getSession();
			if(rs.next()) {
				hs.setAttribute("MgrID", rs.getInt(1));
				hs.setAttribute("Mgremail", rs.getString(4));
				response.sendRedirect("mgrprofile.jsp");
			}
			else
				response.sendRedirect("loginmanager.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
