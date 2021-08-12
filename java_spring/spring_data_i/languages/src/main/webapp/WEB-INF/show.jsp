<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title><p:out value="${language.name}"/></title>
</head>
<body>
	<a href="/languages">Dashboard</a>
	<form action="/languages/${language.id}" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="Delete">
	</form>
	<h1><p:out value="${language.name}"/></h1>
	<p><p:out value="${language.creator}" /></p>
	<p><p:out value="${language.currentVersion}" /></p>
	<a href = "/languages/${language.id}/edit">Edit</a>
	<form action="/languages/${language.id}" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="Delete">
	</form>
</body>
</html>