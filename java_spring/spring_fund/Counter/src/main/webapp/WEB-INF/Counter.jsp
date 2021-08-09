<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
</head>
<body>
	<p>You have visited http://localhost:8080/ <p:out value="${count}"/> times</p>
	<a href = "/">Test another visit?</a>
</body>
</html>