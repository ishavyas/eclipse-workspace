<%@page import="java.sql.*" %>
<%@page import="com.scheduling.*" %>
<%
int id = Integer.parseInt(request.getParameter("AppID"));
String status = request.getParameter("Status");

Connection con = null;
PreparedStatement ps = null;	
con = DbConnect.dbcon();

ps = con.prepareStatement("update Appointment set Status=? where AppID=?");
ps.setString(1,status);
ps.setInt(2,id);
int x = ps.executeUpdate();
if(x!=0)
	response.sendRedirect("drappointmentview.jsp?msg=updated");
%>