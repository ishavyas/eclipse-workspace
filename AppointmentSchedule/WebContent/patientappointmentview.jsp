<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="beige">
<center>Welcome to Patient Portal
<br><br><br><br>
<a href = "patientprofile.jsp">Patient Profile</a> | <a href = "scheduleappointment.jsp">Schedule Appointment</a> |
<a href = "patientappointmentview.jsp">View Appointment</a> | <a href = "index.html">Logout</a>
<br><br><br><br>

<%@page import="java.sql.*" %>
<%@page import="com.scheduling.*" %>
<%@page import="javax.servlet.http.HttpSession" %>

<table border = "2" cellpadding = "20" width = "600" height = "350">
<tr>
<td>AppointmentID</td><td>Patient ID</td><td>Patient Name</td><td>Appointment Date</td><td>Appointment Time</td><td>Dr Name</td><td>Specialization</td><td>Status</td><td>Cancellation</td>
</tr>

<%
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	int id = (Integer)session.getAttribute("Patient_ID");
	ps = con.prepareStatement("select * from Appointment where PatID=?");
	ps.setInt(1,id);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		%>
	<tr>
	<td><%=rs.getInt(1)%></td><td><%=rs.getInt(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td><td><%=rs.getString(6)%></td>
	<td><%=rs.getString(7)%></td><td><%=rs.getString(8)%></td><td><a href="cancelrequest.jsp?AppID=<%=rs.getInt(1)%>">Cancel</a></td></tr>
		
	<%}%>

</center>
</body>
</html>