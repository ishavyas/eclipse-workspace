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
<%	
	
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	int id = (Integer)session.getAttribute("MgrID");
	ps = con.prepareStatement("select * from Empleave where MgrID=?");
	ps.setInt(1,id);
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
	%>
		<form action="./responseapp.jsp" method="post">
		<input type="text" name="LID" value = <%=rs.getInt(1)%>>
		<input type="text" name="EmpID" value = <%=rs.getInt(2)%>>
		<input type="hidden" name="MgrID" value = <%=rs.getInt(3)%>>
		<input type="text" name="EmpName" value = <%=rs.getString(4)%>>
		<input type="text" name="Department" value = <%=rs.getString(5)%>>
		<input type="text" name="Reason" value = <%=rs.getString(6)%>>
		<input type="text" name="StrtDate" value = <%=rs.getString(7)%>>
		<input type="text" name="EndDate" value = <%=rs.getString(8)%>>
		<select name = "Status">
		<option value="Accept">Accept</option>
		<option value="Reject">Reject</option>
		</select>
		<input type="submit" value = "Respond">
		</form>
	<%} %>
</center>
</body>
</html>