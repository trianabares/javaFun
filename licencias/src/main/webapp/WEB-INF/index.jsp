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
<title>Inicio</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

<div class="container">
<h1>DB Licencias</h1>

	<table class="table table-bordered">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Nro licencia</th>
				<th>Fecha Expiración</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="persona">
				<tr>
					<td><c:out value="${persona.firstName}" /> <c:out value="${persona.lastName}" /></td>
					<td><c:out value="${persona.getLicencia().getNumberComoString()}" /></td>
					<td> <fmt:formatDate pattern="MM-dd-yyy" value="${persona.getLicencia().getExpirationDate()}"/> </td>
					<td>
						<a class="btn text-info"href="/persons/${persona.id}">Ver</a>
						<form action="/persons/${persona.id}" method="post">
						<input type="hidden" name="_method" value="delete">
						<input class="btn text-danger" type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<a class="btn btn-primary m-2" href="/persons/new">Nueva Persona</a>
<a class="btn btn-primary m-2" href="/licencias/new">Nueva Licencia</a>
</div>
</body>
</html>