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
<title>Productos y Categorias</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

<div class="container">
	<h1>Productos y categorias</h1>
	<hr>
	<div class="row">
		<div class="col-6">
			<h2>Todos los productos</h2>
			<ul>
			<c:forEach items="${productos }" var="producto">
				<li><a href="products/${producto.id}"><c:out value="${producto.name}"></c:out></a></li>
			</c:forEach>
			</ul>
		</div>
		<div class="col-6">
			<h2>Todos las categorias</h2>
			<ul>
			<c:forEach items="${categorias }" var="categoria">
				<li><a href="categories/${categoria.id}"><c:out value="${categoria.name}"></c:out></a></li>
			</c:forEach>
			</ul>
		</div>
	</div>
	<hr>
	<div class="row">
		<a class="btn btn-success m-2 col" href="/products/new">Nuevo Producto</a><br>
		<a class="btn btn-warning m-2 col" href="/categories/new">Nueva Categoría</a>
	</div>
</div>

</body>
</html>