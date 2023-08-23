
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
<title>Editar Lenguaje</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

	<div class="container">
		<form action="/languages/${language.id}" method="post"
			style="margin-left: 800px;">
			<input type="hidden" name="_method" value="delete"> 
			<input type="submit" value="Borrar"> 
			<a href="/languages" style="margin: 0px 30px;">Dashboard</a>
		</form>
		<form:form action="/languages/${language.id}" method="post"
			modelAttribute="language">
			<input type="hidden" name="_method" value="put">
			<div class="my-4">
				<form:label path="name">Name</form:label>
				<form:errors class="text-danger" path="name" />
				<form:input class="col-3"
					style="margin-left:650px; border: 2px solid black;" path="name" />
			</div>
			<div class="my-4">
				<form:label path="creator">Creator</form:label>
				<form:errors class="text-danger" path="creator" />
				<form:textarea class="col-3"
					style="margin-left:640px; border: 2px solid black;" path="creator" />
			</div>
			<div class="my-4">
				<form:label path="version">Version</form:label>
				<form:errors class="text-danger" path="version" />
				<form:input class="col-3"
					style="margin-left:640px; border: 2px solid black;"
					path="version" />
			</div>
			<input style="margin-left: 910px;" type="submit" value="Submit" />
		</form:form>
	</div>


</body>
</html>