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

<table border = "2" cellpadding = "20" width = "600" height = "350">
<tr>
<td>Patient's ID</td><td>Patient's FirstName</td><td>Patient's LastName</td><td>Patient's email</td><td>Patient's Phone</td><td>Profile Actions</td>
</tr>
<%
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	String email = (String)session.getAttribute("Patient_email");
	ps = con.prepareStatement("select * from Patient where Patient_email=?");
	ps.setString(1,email);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		%>
	<tr>
	<td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getInt(6)%></td>
	<td><a href="updatepatient.jsp?Patient_ID=<%=rs.getInt(1)%>">Update</a></td>
	</tr>
		
	<%} %>

</center>
</body>
</html>