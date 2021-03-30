<%@page import="java.sql.*" %>
<%@page import="com.scheduling.*" %>
<%	
	
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	//int pid = (Integer)session.getAttribute("Patient_ID");
	int id = Integer.parseInt(request.getParameter("AppID"));
	
	ps = con.prepareStatement("delete from Appointment where AppID=?");
	ps.setInt(1,id);
	int x = ps.executeUpdate();
	if(x!=0)
		response.sendRedirect("patientappointmentview.jsp?msg=updated"); 
%>