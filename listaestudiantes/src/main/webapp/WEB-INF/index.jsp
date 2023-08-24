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

	<div class="container">
		<h1>Todos los estudiantes</h1>
		<hr>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Edad</th>
					<th>Direccion</th>
					<th>Ciudad</th>
					<th>Estado</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="estudiante">
					<tr>
						<td><c:out value="${estudiante.nombre}" /> <c:out value="${estudiante.apellido}" /></td>
						<td><c:out value="${estudiante.edad}"></c:out></td>
						<td><c:out value="${estudiante.getContacto().getDireccion()}"></c:out></td>
						<td><c:out value="${estudiante.getContacto().getCiudad()}"></c:out></td>
						<td><c:out value="${estudiante.getContacto().getEstado()}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a class="btn btn-info mt-2 text-light" href="/estudiantes/nuevo">Nuevo Estudiante</a>
		<a class="btn btn-info mt-2 text-light" href="/contactos/nuevo">Nuevo Contacto</a>
	</div>
</body>
</html>