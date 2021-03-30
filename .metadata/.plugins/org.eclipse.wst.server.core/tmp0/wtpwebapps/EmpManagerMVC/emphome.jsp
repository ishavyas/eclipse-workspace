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
<br><br><br><br><br>
<%@page import="com.mvcempmgr.*" %>
<%
EmpLoginBean login = (EmpLoginBean) session.getAttribute("login");
%>
Email:<%=login.getEmail() %> Login Successful
Welcome to ABC Corp
<br><br><br><br><br>
<a href = "empprofile.jsp">Employee Profile</a> | <a href = "leaveapply.jsp" >Apply for Leave</a> |<a href = "empviewleave.jsp" >View Leave</a>| <a href = "index.html">Logout</a></h1>
<br><br><br><br>

</h1></center>
</body>
</html>