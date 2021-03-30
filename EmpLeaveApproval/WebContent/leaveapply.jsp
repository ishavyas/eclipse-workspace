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

<form action="./addleave.jsp" method="post">
<input type="text" name = "EmpID" placeholder=<%=session.getAttribute("EmpID") %>>
<input type="text" name = "MgrID" placeholder="ManagerID">
<input type="text" name = "EmpName" placeholder="Name">
<input type="text" name = "EmpDept" placeholder="Department">
<input type="text" name = "Reason" placeholder="Reason">
<input type="Date" name = "StrtDate" placeholder="Date">
<input type="Date" name = "EndDate" placeholder="Date">
<input type="hidden" name = "Status" placeholder="Pending">
<input type="submit" value = "Apply">
</form>
</center>
</body>
</html>