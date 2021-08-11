<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Insert title here</title>
</head>
<body>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<h1>New Book</h1>
<form:form ()action="/books/update/" + <p:out value="${book.id} }"/>) method="PUT" modelAttribute="book">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input value=<p:out value="${book.title}"/> path="title"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea value=<p:out value="${book.description}"/> path="description"/>
    </p>
    <p>
        <form:label path="language">Language</form:label>
        <form:errors path="language"/>
        <form:input value=<p:out value="${book.language}"/> path="language"/>
    </p>
    <p>
        <form:label path="numberOfPages">Pages</form:label>
        <form:errors path="numberOfPages"/>     
        <form:input value=<p:out value="${book.numberOfPages}"/> type="number" path="numberOfPages"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>