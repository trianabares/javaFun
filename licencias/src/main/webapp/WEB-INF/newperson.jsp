
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
<title>Nueva Persona</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
	<div class="container">
		<h2>Nueva Persona</h2>
		<div class="col-sm-4">
		<form:form action="/persons/new" method="POST" modelAttribute="persona">
            <div class="form-group">
                <form:label class="form-label" path="firstName">Nombre</form:label>
                <form:errors class="text-danger" path="firstName" />
                <form:input class="form-control" path="firstName" />
            </div>
            <div class="form-group">
                <form:label class="form-label" path="lastName">Apellido</form:label>
                <form:errors class="text-danger" path="lastName" />
                <form:input class="form-control" path="lastName" />
            </div>
            <button class="btn btn-success m-2">Agregar</button>
        </form:form>
        </div>
        <a class="btn btn-primary m-2" href="/">Volver</a>
	</div>
</body>
</html>