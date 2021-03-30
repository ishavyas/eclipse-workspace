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
MgrLoginBean login = (MgrLoginBean) session.getAttribute("login");
%>
Email:<%=login.getEmail() %> Login Successful
Welcome to ABC Corp
<br><br><br><br><br>
<a href = "mgrprofile.jsp">Manager Profile</a> | <a href = "viewapplications.jsp" >Leave Applications</a> | <a href = "index.html">Logout</a>
<br><br><br><br>
</h1></center>

</body>
</html>