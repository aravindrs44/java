<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Product Page</title>
</head>
<body>
	<h1><p:out value="${product.name}" /></h1>
	<p>Categories:</p>
	<ul>
		<p:forEach items="${product.categories }" var="appliedCategories">
			<li>${appliedCategories.name}</li>
		</p:forEach>
	</ul>
	
</body>
</html>