/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-03-11 01:36:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.scheduling.*;

public final class doctorprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"beige\">\r\n");
      out.write("<center><h1>Welcome to Doctor's Portal\r\n");
      out.write("<a href = \"doctorprofile.jsp\">Doctor Profile</a> | <a href = \"drappointmentview.jsp\">View Appointment</a> \r\n");
      out.write("| <a href = \"respondappointment.jsp\">Respond Appointment</a> | <a href = \"index.html\">Logout</a>\r\n");
      out.write("</h1>\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border = \"2\" cellpadding = \"20\" width = \"400\" height = \"150\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Doctor's ID</td><td>Doctor's FirstName</td><td>Doctor's LastName</td><td>Doctor's email</td><td>Doctor's Phone</td><td>Doctor's Specilization</td><td>Profile Actions</td>\r\n");
      out.write("</tr>\r\n");

	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	String email = (String)session.getAttribute("Dr_email");
	ps = con.prepareStatement("select * from Doctor where Dr_email=?");
	ps.setString(1, email);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>");
      out.print(rs.getInt(1));
      out.write("</td><td>");
      out.print(rs.getString(2));
      out.write("</td><td>");
      out.print(rs.getString(3));
      out.write("</td><td>");
      out.print(rs.getString(4));
      out.write("</td><td>");
      out.print(rs.getInt(6));
      out.write("</td><td>");
      out.print(rs.getString(7));
      out.write("</td>\r\n");
      out.write("\t<td><a href=\"updatedoctor.jsp?Dr_ID=");
      out.print(rs.getInt(1));
      out.write("\">Update</a></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
