<%@page import="java.sql.*" %>
<%@page import="com.empleaveapproval.*" %>
<%	
	
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	//int pid = (Integer)session.getAttribute("Patient_ID");
	int id = Integer.parseInt(request.getParameter("LID"));
	
	ps = con.prepareStatement("delete from Empleave where LID=?");
	ps.setInt(1,id);
	int x = ps.executeUpdate();
	if(x!=0)
		response.sendRedirect("empviewleave.jsp?msg=updated"); 
%>