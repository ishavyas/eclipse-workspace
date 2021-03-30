<%@page import="java.sql.*" %>
<%@page import="com.scheduling.*" %>
<%
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	String pname = request.getParameter("PatName");
	String dname = request.getParameter("DrName");
	String spl = request.getParameter("DrSpl");	
	String date = request.getParameter("AppmntDate");
	String time = request.getParameter("AppmntTime");
	int id = (Integer)session.getAttribute("Patient_ID");
	ps = con.prepareStatement("insert into Appointment(PatName, PatID, AppmntDate, AppmntTime, DrName, DrSpl ) values (?, ?, ?, ?, ?, ?)");
	ps.setString(1,pname);
	ps.setInt(2,id);
	ps.setString(3, date);
	ps.setString(4,time);
	ps.setString(5,dname);
	ps.setString(6,spl);
	int x = ps.executeUpdate();
	if(x!=0)
		response.sendRedirect("patientappointmentview.jsp");
%>