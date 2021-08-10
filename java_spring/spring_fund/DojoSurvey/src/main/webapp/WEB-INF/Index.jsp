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
	<fieldset>
		<legend>Survey</legend>
		<form action="/check" method="POST">
			<input placeholder="name" type="text" name="name">
			<input placeholder="location" type="text" name="location">
			<input placeholder="language" type="text" name="language">
			<textarea placeholder="comment" rows="4" cols="25" name="comment"></textarea>
			<button type="submit">Button</button>
		</form>
	</fieldset>
</body>
</html>