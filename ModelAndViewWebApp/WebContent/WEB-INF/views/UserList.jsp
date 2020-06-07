<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user Store Application</title>
</head>
<body bgcolor="yellow">
	<h3 align="center">User Management Application</h3>
	<div align="center">
	<table border="1" cellpadding="5">
	<caption><h3>List of Users</h3></caption>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Email</th>
				<th>Country</th>
			</tr>
			<c:forEach var="user" items="${userList}">
				<tr>
					<td><c:out value="${user.name}"/></td>
					<td><c:out value="${user.age}"/></td>
					<td><c:out value="${user.email}"/></td>
					<td><c:out value="${user.country}"/></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>