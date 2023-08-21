
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

	<h1>Lenguages</h1>

	<table>
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
			        <td><a href="${language.id}"><c:out value="${language.name}"></c:out></a></td>
			        <td><c:out value="${language.creator}"></c:out></td>
			        <td><c:out value="${language.version}"></c:out></td>
			        <td><a href="${language.id}/delete">delete</a><a href="${language.id}/edit">edit</a></td>
			    </tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
	<form:form action="/add" method="POST" modelAttribute="nuevolang">
	    <table>
	        <thead>
	            <tr>
	                <td>Name:</td>
	                <td><form:errors path="name" class="text-danger" /> <form:input class="input" path="name" /></td>
	            </tr>
	            <tr>
	                <td>Creator:</td>
	                <td><form:errors path="creator" class="text-danger" /> <form:input class="input" path="creator" /></td>
	            </tr>
	            <tr>
	                <td>Version:</td>
	                <td><form:errors path="version" class="text-danger" /> <form:input class="input" type="text" path="version" /></td>
	            </tr>
	            <tr>
	        		<td colspan=2><input class="input" class="button" type="submit" value="Submit"/></td>
	        	</tr>
	        </thead>
	    </table>
	</form:form>
</body>
</html>