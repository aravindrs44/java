<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Dojo Survey Index</title>
</head>
<body>
	<h1 style="text-decoration: underline;">Submitted Info</h1>
	<p>Name: ${name}</p>
	<p>Dojo Location: ${location}</p>
	<p>Favorite Language: ${language}</p>
	<p>Comment: ${comment}</p>
</body>
</html>