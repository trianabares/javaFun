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
<title>Contactos</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

	<div class="container col-6 mx-auto">
		<h1>Nuevo Contacto</h1>
		<hr>
		<form:form action="/contactos/nuevo" method="POST" modelAttribute="contactos">
			<form:select class="form-control" path="estudiantes">
				<c:forEach items="${estudiantes}" var="e">
					<form:option value="${e.id}">${e.nombre } ${e.apellido }</form:option>
				</c:forEach>
			</form:select>
			<div class="form-group">
				<form:label class="form-label" path="direccion">Direccion:</form:label>
				<form:errors class="text-danger" path="direccion" />
				<form:input type="text" class="form-control" path="direccion" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="ciudad">Ciudad:</form:label>
				<form:errors class="text-danger" path="ciudad" />
				<form:input type="text" class="form-control" path="ciudad" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="estado">Estado:</form:label>
				<form:errors class="text-danger" path="estado" />
				<form:input type="text" class="form-control" path="estado" />
			</div>
			<button class="btn btn-success mt-2">Agregar</button>
		</form:form>
		<a class="btn btn-info mt-2 text-light" href="/">Volver</a>
	</div>
</body>
</html>