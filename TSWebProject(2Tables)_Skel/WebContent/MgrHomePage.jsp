<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background = "Gray-background.jpg">
		<%
		String user = (String)session.getAttribute("user");
		 %>
		<h3>Hi: <%=user %><center><h2>WELCOME TO MANAGER HOME PAGE</h2></center>
		<hr>
		<h3><center><a href='DisplayAllEmp'>Display All Employees</a></center></h3>
		<h3><center><a href='DiaplayAllDepts'>Display All Departments</a></center></h3>
		<h3><center><a href='RegisterDept.jsp'>Add Department</a></center></h3>
		<h3><center><a href='getDeptById.jsp'>Display Department By Id</a></center></h3>
		<h3><center><a href='RegisterEmp.jsp'>Add New Employee</a></center></h3>	
		<h3><center><a href='getEmpById.jsp'>Display Employee By Id</a></center></h3>	
</body>
</html>