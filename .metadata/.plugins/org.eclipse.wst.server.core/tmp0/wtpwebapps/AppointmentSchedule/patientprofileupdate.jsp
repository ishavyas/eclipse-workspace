<%@page import="java.sql.*" %>
<%@page import="com.scheduling.*" %>
<%
int id = Integer.parseInt(request.getParameter("Patient_ID"));
String fname = request.getParameter("Patient_FirstName");
String lname = request.getParameter("Patient_LastName");
String email = request.getParameter("Patient_email");
int phone = Integer.parseInt(request.getParameter("Patient_ph"));
Connection con = null;
PreparedStatement ps = null;	
con = DbConnect.dbcon();

ps = con.prepareStatement("update Patient set Patient_FirstName=?, Patient_LastName=?, Patient_email=?, Patient_ph=? where Patient_ID=?");
ps.setString(1, fname);
ps.setString(2, lname);
ps.setString(3, email );
ps.setInt(4, phone);
ps.setInt(5,id);
int x = ps.executeUpdate();
if(x!=0)
	response.sendRedirect("patientprofile.jsp?msg=updated");
%>