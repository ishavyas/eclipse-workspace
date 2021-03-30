<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="beige">
<br><br><br><br><br>
<center><h1>Employee Details
<br><br><br><br><br>
<a href = "addemployee.html">Add Employee</a> | <a href = "viewemployee.jsp">View Employee</a></h1>
<br><br><br><br>


<%@page import="java.sql.*" %>
<%@page import="com.empDetails.*" %>

<form action="search.jsp" method = "post">
<input type="text" name = "Name" placeholder="Search here">
<input type="submit" value="Search"></form>

<table border = "2" cellpadding = "20" width = "600" height = "350">
<tr>
<td>Name</td><td>Role</td><td>Salary</td><td>email</td><td>Department</td>
</tr>
<%
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	con = DbConnect.dbcon();
	ps = con.prepareStatement("select * from empDetails");
	rs = ps.executeQuery();
	while(rs.next()){
		%>
	<tr>
	<td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td><td><%=rs.getString(7)%></td>
	</tr>
		
	<%} %>

</table>
</center>
</body>
</html>