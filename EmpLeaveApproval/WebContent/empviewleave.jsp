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
<td>EmployeeID</td><td>ManagerID</td><td>EmployeeName</td><td>Department</td><td>Reason</td><td>From</td><td>To</td><td>Status</td>
</tr>

<%
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	int id = (Integer)session.getAttribute("EmpID");
	ps = con.prepareStatement("select * from Empleave where EmpID=?");
	ps.setInt(1,id);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		%>
	<tr>
	<td><%=rs.getInt(2)%></td><td><%=rs.getInt(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td><td><%=rs.getString(6)%></td>
	<td><%=rs.getString(7)%></td><td><%=rs.getString(8)%></td><td><%=rs.getString(9)%></td><td><a href="cancelleave.jsp?LID=<%=rs.getInt(1)%>">Cancel</a></td></tr>
		
	<%} %>
</center>
</body>
</html>