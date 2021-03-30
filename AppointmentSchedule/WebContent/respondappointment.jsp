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
	
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	ps = con.prepareStatement("select * from Appointment");
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
	%>
		<form action="./responseappt.jsp" method="post">
		<input type="text" name="AppID" value = <%=rs.getInt(1)%>>
		<input type="hidden" name="PatID" value = <%=rs.getInt(2)%>>
		<input type="text" name="PatName" value = <%=rs.getString(3)%>>
		<input type="text" name="AppmntDate" value = <%=rs.getString(4)%>>
		<input type="text" name="AppmntTime" value = <%=rs.getString(5)%>>
		<input type="text" name="DrName" value = <%=rs.getString(6)%>>
		<input type="text" name="DrSpl" value = <%=rs.getString(7)%>>
		<select name = "Status">
		<option value="Accept">Accept</option>
		<option value="Reschedule">Reschedule</option>
		<option value="Reject">Reject</option>
		</select>
		<input type="submit" value = "Respond">
		</form>
	<%} %>
</center>
</body>
</html>