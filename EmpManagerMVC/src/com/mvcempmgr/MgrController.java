package com.mvcempmgr;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MgrController
 */

public class MgrController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String email = request.getParameter("Mgremail");
		String passwd = request.getParameter("Mgrpassword");
		EmpLoginBean login = new EmpLoginBean();
		login.setEmail(email);
		login.setPassword(passwd);
		HttpSession hs = request.getSession();
		hs.setAttribute("login", login);
		try {
			boolean status = login.validate(email, passwd);
			if(status) {
				response.sendRedirect("mgrprofile.jsp");
			}
			else {
				response.sendRedirect("loginmanager.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
