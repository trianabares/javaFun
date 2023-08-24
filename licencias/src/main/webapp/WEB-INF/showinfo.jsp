
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
<title>Titulo de la plantilla</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
<div class="container">
	<h1>
		<c:out value="${persona.firstName}" /> <c:out value="${persona.lastName}" />
	</h1>

	<h5>Licence number:</h5>
		<c:out value="${persona.getLicencia().getNumberComoString()}" />
	
	<h5>Expiration date:</h5>
		<fmt:formatDate pattern="MM-dd-yyy" value="${persona.getLicencia().getExpirationDate()}"/>
	
	<form action="/persons/${persona.id}" method="post">
		<input type="hidden" name="_method" value="delete">
		<input class="btn btn-danger m-2" type="submit" value="Delete">
	</form>

	<a class="btn btn-primary m-2" href="/">Volver</a>
</div>
</body>
</html>