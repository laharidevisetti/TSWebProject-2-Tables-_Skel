<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="MgrHomePage.jsp" />
	<table border=2 align=center>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>LOCATION</th>
		</tr>
		<c:forEach var="dept" items="${DepartmentsData}">
			<tr>
				<td>${dept.deptId}</td>
				<td>${dept.deptName}</td>
				<td>${dept.deptLocation}</td></tr>
		</c:forEach>
		</table>
		
		
</body>
</html>