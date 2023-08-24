
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
			<div class="col">
				<div class="my-5">
					<h1><c:out value="${language.name }"></c:out></h1>
				</div>
				<div class="my-5">
					<h3><c:out value="${language.creator }"></c:out></h3>
				</div>
				<div class="my-5">
					<h5><c:out value="${language.version }"></c:out></h5>
				</div>

			</div>
		</div>
		<div>
			<a class="btn btn-info m-2" class="in-line" href="/languages/${language.id}/edit">Edit</a>
			<form action="/languages/${language.id}" method="post">
							<input type="hidden" name="_method" value="delete"> 
							<input class="btn btn-warning m-2" type="submit" value="Borrar">
			</form> 
		</div>
		<a class="mt-4 mb-3 btn btn-primary m-2" style="margin-left: 900px;" href="/languages">Volver</a>

	</div>

</body>
</html>