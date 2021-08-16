 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>New Product</title>
</head>
<body>
	<form:form action="/products/create" method="post" modelAttribute="product">
	   <p>
	       <form:label path="name">Name</form:label>
	       <form:errors path="name"/>
	       <form:input path="name"/>
	   </p>   
	   <p>
	       <form:label path="description">Description</form:label>
	       <form:errors path="description"/>
	       <form:input path="description"/>
	   </p>   
	   <p>
	       <form:label path="price">Price</form:label>
	       <form:errors path="price"/>
	       <form:input type="number" step=".01" path="price"/>
	   </p>   
	   <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>