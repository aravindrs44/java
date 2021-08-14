<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Dojo Page</title>
</head>
<body>
	<h1><p:out value="${dojo.name}" /> Location Ninjas</h1>
	<table>
		<thead>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Age</td>
			</tr>
		</thead>
		<tbody>
			<p:forEach items="${ninjas}" var="ninja">
        		<tr>
        			<td>${ninja.firstName}</td>
        			<td>${ninja.lastName}</td>
        			<td>${ninja.age}</td>
        		</tr>
        	</p:forEach>
		</tbody>
	</table>
</body>
</html>