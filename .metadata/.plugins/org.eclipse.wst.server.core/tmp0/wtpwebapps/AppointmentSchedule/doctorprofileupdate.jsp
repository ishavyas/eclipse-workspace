<%@page import="java.sql.*" %>
<%@page import="com.scheduling.*" %>
<%
int id = Integer.parseInt(request.getParameter("Dr_ID"));
String fname = request.getParameter("Dr_FirstName");
String lname = request.getParameter("Dr_LastName");
String email = request.getParameter("Dr_email");
int phone = Integer.parseInt(request.getParameter("Dr_ph"));
String spl = request.getParameter("Dr_Spl");
Connection con = null;
PreparedStatement ps = null;	
con = DbConnect.dbcon();
ps = con.prepareStatement("update Doctor set Dr_FirstName=?, Dr_LastName=?, Dr_email=?, Dr_ph=?, Dr_Spl=? where Dr_ID=?");
ps.setString(1, fname);
ps.setString(2, lname);
ps.setString(3, email );
ps.setInt(4, phone);
ps.setString(5,spl);
ps.setInt(6,id);
int x = ps.executeUpdate();
if(x!=0)
	response.sendRedirect("doctorprofile.jsp?msg=updated");
%>