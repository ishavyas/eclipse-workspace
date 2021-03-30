<%@page import="java.sql.*" %>
<%@page import="com.empleaveapproval.*" %>
<%
int lid = Integer.parseInt(request.getParameter("LID"));
String status = request.getParameter("Status");

Connection con = null;
PreparedStatement ps = null;	
con = DbConnect.dbcon();

ps = con.prepareStatement("update Empleave set Status=? where LID=?");
ps.setString(1,status);
ps.setInt(2,lid);
int x = ps.executeUpdate();
if(x!=0)
	response.sendRedirect("viewapplications.jsp?msg=updated");
%>