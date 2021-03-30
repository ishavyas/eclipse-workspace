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
<td>Doctor's ID</td><td>Doctor's FirstName</td><td>Doctor's LastName</td><td>Doctor's email</td><td>Doctor's Phone</td><td>Doctor's Specilization</td><td>Profile Actions</td>
</tr>
<%
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	String email = (String)session.getAttribute("Dr_email");
	ps = con.prepareStatement("select * from Doctor where Dr_email=?");
	ps.setString(1, email);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		%>
	<tr>
	<td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getInt(6)%></td><td><%=rs.getString(7)%></td>
	<td><a href="updatedoctor.jsp?Dr_ID=<%=rs.getInt(1)%>">Update</a></td>
	</tr>
		
	<%} %>
</center>
</body>
</html>