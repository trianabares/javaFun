
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
		<div class="row">
			<a class="mt-4 mb-3" style="margin-left: 900px;" href="/languages">Dashboard</a>
			<div class="col">
				<div class="my-5">
					<c:out value="${language.name }"></c:out>
				</div>
				<div class="my-5">
					<c:out value="${language.creator }"></c:out>
				</div>
				<div class="my-5">
					<c:out value="${language.version }"></c:out>
				</div>

			</div>
		</div>
		<div>
			<a class="in-line" href="/languages/${language.id}/edit">Edit</a>
			<form style="margin-top: 20px;" action="/languages/${language.id}"
				method="post">
				<input type="hidden" name="_method" value="delete"> <input
					type="submit" value="Delete">
			</form>
		</div>

	</div>

</body>
</html>