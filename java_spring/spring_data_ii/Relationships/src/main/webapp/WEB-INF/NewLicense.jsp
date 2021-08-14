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
	<title>New License</title>
</head>
<body>
	<form:form action="/licenses/create" method="post" modelAttribute="license">
	<p>
        <form:label path="person">Person</form:label>
        <form:errors path="person"/>
        <form:select path="person">
        	<option value="" disabled selected>
        	<p:out items="${allPersons }" var="person">
        		<form:option value="${person.id }">
        			"${person.firstName} ${person.lastName}"
        		</form:option>
        	</p:out>
        </form:select>
    </p>
    <p>
        <form:label path="state">State</form:label>
        <form:errors path="state"/>
        <form:input path="state"/>
    </p>
    <p>
        <form:label path="expirationDate">Expiration Date</form:label>
        <form:errors path="expirationDate"/>
        <form:textarea path="expirationDate"/>
    </p> 
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>