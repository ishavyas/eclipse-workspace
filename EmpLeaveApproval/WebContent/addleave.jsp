<%@page import="java.sql.*" %>
<%@page import="com.empleaveapproval.*" %>
<%
	Connection con = null;
	PreparedStatement ps = null;	
	con = DbConnect.dbcon();
	int mid = Integer.parseInt(request.getParameter("MgrID"));
	String name = request.getParameter("EmpName");
	String dept = request.getParameter("EmpDept");
	String reasn = request.getParameter("Reason");	
	String sdate = request.getParameter("StrtDate");
	String edate = request.getParameter("EndDate");
	int eid = (Integer)session.getAttribute("EmpID");
	ps = con.prepareStatement("insert into Empleave(EmpID, MgrID, EmpName, EmpDept, Reason, StrtDate, EndDate ) values (?, ?, ?, ?, ?, ?, ?)");
	ps.setInt(1, eid);
	ps.setInt(2,mid);
	ps.setString(3, name);
	ps.setString(4,dept);
	ps.setString(5,reasn);
	ps.setString(6,sdate);
	ps.setString(7,edate);
	int x = ps.executeUpdate();
	if(x!=0)
		response.sendRedirect("empviewleave.jsp");
%>