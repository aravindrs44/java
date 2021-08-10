<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Ninja Gold Game</title>
</head>
<body>
	<h2>Your Gold:</h2>
	<p><p:out value="${gold}"/></p>
	<form action="/logic" method="POST">
		<fieldset>
			<legend>Farm</legend>
			<p>(earns 10-20 gold)</p>
			<input type="hidden" name="type" value="farm">
			<button type="submit">Find Gold!</button>
		</fieldset>
	</form>
	<form action="/logic" method="POST">
		<fieldset>
			<legend>Cave</legend>
			<p>(earns 5-10 gold)</p>
			<input type="hidden" name="type" value="cave">
			<button type="submit">Find Gold!</button>
		</fieldset>
	</form>
	<form action="/logic" method="POST">
		<fieldset>
			<legend>House</legend>
			<p>(earns 2-5 gold)</p>
			<input type="hidden" name="type" value="house">
			<button type="submit">Find Gold!</button>
		</fieldset>
	</form>
	<form action="/logic" method="POST">
		<fieldset>
			<legend>Casino!</legend>
			<p>(earns/takes 0-50 gold)</p>
			<input type="hidden" name="type" value="casino">
			<button type="submit">Find Gold!</button>
		</fieldset>
	</form>
	<fieldset>
		<legend>Activities</legend>
		<p:forEach var="activity" items="${activityLog}">
			<p><p:out value= "${activity}" /></p>
		</p:forEach>
	</fieldset>
</body>
</html>