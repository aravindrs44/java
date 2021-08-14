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
	<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/ninjas/create" method="post" modelAttribute="ninja">
    	<p>
        	<form:label path="dojo">Dojo</form:label>
        	<form:errors path="dojo"/>
        	<form:select path="dojo">
        		<option value="" disabled selected>
        		<p:forEach items="${allDojos}" var="dojo">
        		<form:option value="${dojo.id}">
        			${dojo.name}
        		</form:option>
        		</p:forEach>
        	</form:select>
   		</p>
   		<p>
        	<form:label path="firstName">First Name</form:label>
        	<form:errors path="firstName"/>
        	<form:input path="firstName"/>
   		</p>
   		<p>
        	<form:label path="lastName">Last Name</form:label>
        	<form:errors path="lastName"/>
        	<form:input path="lastName"/>
   		</p>
   		<p>
        	<form:label path="age">Age</form:label>
        	<form:errors path="age"/>
        	<form:input type="number" path="age"/>
   		</p>   
   <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>