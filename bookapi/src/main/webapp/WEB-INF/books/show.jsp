
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formateo fechas (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- Formulario form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- para errores de renderizado en rutas PUT -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${book.title}" /></title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

	<h1>
		<c:out value="${book.title}" />
	</h1>

	<p>
		Description:
		<c:out value="${book.description}" />
	</p>
	<p>
		Language:
		<c:out value="${book.language}" />
	</p>
	<p>
		Number of pages:
		<c:out value="${book.numberOfPages}" />
	</p>
	<a href="/books/${book.id}/edit">Edit Book</a>
	<form action="/books/${book.id}" method="post">
		<input type="hidden" name="_method" value="delete"> <input
			type="submit" value="Delete">
	</form>

<a href="/books">Volver</a>

</body>
</html>