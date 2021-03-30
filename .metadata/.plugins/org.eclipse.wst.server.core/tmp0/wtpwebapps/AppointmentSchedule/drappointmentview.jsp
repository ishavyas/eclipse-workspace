<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="beige">
<center><h1>Welcome to Doctor's Portal
<a href = "doctorprofile.jsp">Doctor Profile</a> | <a href = "drappointmentview.jsp">View Appointment</a> 
| <a href = "respondappointment.jsp">Respond Appointment</a> | <a href = "index.html">Logout</a>
</h1>
<br><br><br><br>

<%@page import="java.sql.*" %>
<%@page import="com.scheduling.*" %>
<table border = "2" cellpadding = "20" width = "400" height = "150">
<tr>
<td>Appointment ID</td><td>Patient Name</td><td>Appointment Date</td><td>Appointment Time</td><td>Dr Name</td><td>Specialization</td><td>Status</td><td>Action</td>
</tr>
<%
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	ps = con.prepareStatement("select * from Appointment");
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		%>
	<tr>
	<td><%=rs.getInt(1)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td><td><%=rs.getString(6)%></td>
	<td><%=rs.getString(7)%></td><td><%=rs.getString(8)%></td><%if(rs.getString(8).equalsIgnoreCase("Pending")){ %><td><a href="respondappointment.jsp?AppID=<%=rs.getInt(1)%>">Respond</a></td>
	<%}else{%>
	<td>Responded</td>
	<%}%>	
	</tr>		
	<%} %>
</body>
</html>