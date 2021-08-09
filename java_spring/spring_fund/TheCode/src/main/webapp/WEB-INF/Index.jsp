<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Secret Code</title>
</head>
<body>
	<form method="POST" action="/login">
		<p style="color: red;"><p:out value="${error} "/></p>
		<label>What is the code?</label>
		<input type="text" name="code"/>
		<button type="submit">Try Code</button>
	</form>
</body>
</html>