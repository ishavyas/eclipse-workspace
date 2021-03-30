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
 * Servlet implementation class AddManager
 */

public class AddManager extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;	
	public void init(ServletConfig config) {
		con = DbConnect.dbcon();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("MgrID"));
		String name = request.getParameter("MgrName");
		String email = request.getParameter("Mgremail");
		String password = request.getParameter("Mgrpassword");
		String department = request.getParameter("MgrDept");
		
		try {
			ps = con.prepareStatement("insert into Manager(MgrID, MgrName, MgrDept, Mgremail, Mgrpassword) values (?, ?, ?, ?, ?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, department);
			ps.setString(4, email);
			ps.setString(5, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int x = ps.executeUpdate();
			if(x!=0)
				response.sendRedirect("loginmanager.html?msg=success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
