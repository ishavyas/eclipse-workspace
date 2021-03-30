package com.mvcempmgr;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EmpProfileController
 */

public class EmpProfileController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String email = request.getParameter("Empemail");
		 try {
			List<EmpDetails> list = new EmpDetails().Displaydetails(email);
			request.setAttribute("emplist", list);
			//request.getRequestDispatcher("empprofile.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
