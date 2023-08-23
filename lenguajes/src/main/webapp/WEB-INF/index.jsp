
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
		<h1>Lenguajes</h1>

		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="language" items="${lang}">
					<tr>
						<td><a href="/languages/${language.id}"><c:out
									value="${language.name}"></c:out></a></td>
						<td><c:out value="${language.creator}"></c:out></td>
						<td><c:out value="${language.version}"></c:out></td>
						<td>
							<form action="/languages/${language.id}" method="post">
							<input type="hidden" name="_method" value="delete"> 
							<input type="submit" value="Borrar">
							</form> 
							
							<a href="languages/${language.id}/edit">edit</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<form:form action="/languages" method="POST"
			modelAttribute="nuevolenguaje">
			<div class="form-group">
				<form:label class="form-label" path="name">Nombre: </form:label>
				<form:errors class="text-danger" path="name" />
				<form:input class="form-control" path="name" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="creator">Creator: </form:label>
				<form:errors class="text-danger" path="creator" />
				<form:input class="form-control" path="creator" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="version">Version: </form:label>
				<form:errors class="text-danger" path="version" />
				<form:input class="form-control" path="version" />
			</div>
			<button class="btn btn-success">Agregar</button>
		</form:form>
	</div>
</body>
</html>