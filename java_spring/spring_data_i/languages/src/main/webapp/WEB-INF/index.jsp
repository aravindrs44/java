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
	<title>Languages</title>
</head>
<body>
	<table>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>			
		</tr>
			<p:forEach items="${langs}" var="lang">
				<tr>
					<td><a href="/languages/${lang.id}"><p:out value="${lang.name}" /></a></td>			
					<td><p:out value="${lang.creator}"/></td>			
					<td><p:out value="${lang.currentVersion}"/></td>			
					<td>
						<form action="/languages/${lang.id}" method="post">
							<input type="hidden" name="_method" value="delete">
							<input type="submit" value="Delete">
						</form>
						<a href="/languages/${lang.id}/edit">Edit</a>
					</td>			
				</tr>
			</p:forEach>
	</table>
<h1>New Language</h1>
<form:form action="/languages" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:textarea path="creator"/>
    </p>
    <p>
        <form:label path="currentVersion">Version</form:label>
        <form:errors path="currentVersion"/>
        <form:input path="currentVersion"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>