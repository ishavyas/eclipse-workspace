<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="beige">
<center><h1>Welcome to Patient Portal
<br><br><br><br><br><br>
<a href = "doctorprofile.jsp">Doctor Profile</a> | <a href = "drappointmentview.jsp">View Appointment</a> 
| <a href = "respondappointment.jsp">Respond Appointment</a> | <a href = "index.html">Logout</a>
</h1>
<br><br><br><br><br><br>

<%@page import="java.sql.*" %>
<%@page import="com.scheduling.*" %>
<%	
	int id = (Integer)session.getAttribute("Dr_ID");
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	ps = con.prepareStatement("select * from Doctor where Dr_ID=?");
	ps.setInt(1,id);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
	%>
		<form action="./doctorprofileupdate.jsp" method="post">
		<input type="hidden" name="Dr_ID" value = <%=rs.getInt(1)%>>
		<input type="text" name="Dr_FirstName" value = <%=rs.getString(2)%>>
		<input type="text" name="Dr_LastName" value = <%=rs.getString(3)%>>
		<input type="text" name="Dr_email" value = <%=rs.getString(4)%>>
		<input type="text" name="Dr_ph" value = <%=rs.getInt(6)%>>
		<input type="text" name="Dr_Spl" value = <%=rs.getString(7)%>>
		<input type="submit" value = "Update">
		</form>
	<%} %>
</center>
</body>
</html>
