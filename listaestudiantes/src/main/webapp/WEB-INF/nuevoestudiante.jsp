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
<title>Estudiantes</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

	<div class="container col-6 mx-auto">
		<h1>Nuevo Estudiante</h1>
		<hr>
		<form:form action="/estudiantes/nuevo" method="POST" modelAttribute="estudiante">
			<div class="form-group">
				<form:label class="form-label" path="nombre">Nombre:</form:label>
				<form:errors class="text-danger" path="nombre" />
				<form:input type="text" class="form-control" path="nombre" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="apellido">Apellido:</form:label>
				<form:errors class="text-danger" path="apellido" />
				<form:input type="text" class="form-control" path="apellido" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="edad">Edad:</form:label>
				<form:errors class="text-danger" path="edad" />
				<form:input type="number" class="form-control" path="edad" />
			</div>
			<button class="btn btn-success mt-2">Agregar</button>
		</form:form>
	<a class="btn btn-info mt-2 text-light" href="/">Volver</a>
	</div>
</body>
</html>