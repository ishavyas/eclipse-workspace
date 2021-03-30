<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="beige">
<center><h1>Welcome to ABC Corp
<br><br><br><br><br>
<a href = "empprofile.jsp">Employee Profile</a> | <a href = "leaveapply.jsp" >Apply for Leave</a> |<a href = "empviewleave.jsp" >View Leave</a>| <a href = "index.html">Logout</a></h1>
<br><br><br><br>

<%@page import="java.sql.*" %>
<%@page import="com.empleaveapproval.*" %>

<table border = "2" cellpadding = "20" width = "400" height = "150">
<tr>
<td>Employee ID</td><td>Employee Name</td><td>Employee Role</td><td>Employee Department</td><td>Employee email</td>
</tr>
<%
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	String email = (String)session.getAttribute("Empemail");
	ps = con.prepareStatement("select * from Employee where Empemail=?");
	ps.setString(1,email);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		%>
	<tr>
	<td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td>
	</tr>
		
	<%} %>

</center>
</body>
</html>