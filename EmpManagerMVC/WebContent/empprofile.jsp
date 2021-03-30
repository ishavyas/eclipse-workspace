<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "beige">
<center><h1>
Welcome to ABC Corp
<br><br><br><br><br>
<a href = "empprofile.jsp">Employee Profile</a> | <a href = "leaveapply.jsp" >Apply for Leave</a> |<a href = "empviewleave.jsp" >View Leave</a>| <a href = "index.html">Logout</a></h1>
<br><br><br><br>
<%@page import="com.mvcempmgr.*" %>

<table border = "2" cellpadding = "20" width = "400" height = "150">
<tr>
<td>Employee ID</td><td>Employee Name</td><td>Employee Role</td><td>Employee Department</td><td>Employee email</td>
</tr>
<%
EmpDetails emp = (EmpDetails)session.getAttribute("emplist"); 
%>
<tr>
<td><%=emp.getEmpid()%></td><td><%=emp.getEmpname()%></td><td><%=emp.getEmprole()%></td><td><%=emp.getEmpdept()%></td><td><%=emp.getEmpemail()%></td>
</tr>

</h1></center>
</body>
</html>