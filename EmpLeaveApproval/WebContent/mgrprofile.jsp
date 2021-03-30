<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="beige">
<center><h1>Welcome to ABC Corp
<br><br><br><br><br>
<a href = "mgrprofile.jsp">Manager Profile</a> | <a href = "viewapplications.jsp" >Leave Applications</a> | <a href = "index.html">Logout</a>
</h1>
<br><br><br><br>

<%@page import="java.sql.*" %>
<%@page import="com.empleaveapproval.*" %>

<table border = "2" cellpadding = "20" width = "400" height = "150">
<tr>
<td>Manager ID</td><td>Manager Name</td><td>Manager Department</td><td>Manager email</td>
</tr>
<%
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	String email = (String)session.getAttribute("Mgremail");
	ps = con.prepareStatement("select * from Manager where Mgremail=?");
	ps.setString(1,email);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		%>
	<tr>
	<td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td>
	</tr>
		
	<%} %>

</center>
</body>
</html>