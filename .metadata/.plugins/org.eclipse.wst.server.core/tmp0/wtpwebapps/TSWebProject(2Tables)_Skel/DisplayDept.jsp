<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="MgrHomePage.jsp"></jsp:include>
 	<table border=2 align=center>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>Location</th>
			</tr>
		<tr>
			<td>${DepartmentsData.deptId}</td>
			<td>${DepartmentsData.deptName}</td>
			<td>${DepartmentsData.deptLocation}</td>
</body>
</html>