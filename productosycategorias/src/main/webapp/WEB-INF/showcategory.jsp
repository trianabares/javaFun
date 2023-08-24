
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
<title><c:out value="${categoria.name }"></c:out></title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

	<div class="container">

		<h1>
			<c:out value="${categoria.name }">
			</c:out>
		</h1>
		<div class="row">
			<div class="col-6">
				<h2>Productos</h2>
				<ul>
					<c:forEach items="${categoria.getProducts() }" var="productos">
						<li><c:out value="${productos.name }"> </c:out></li>
					</c:forEach>
				</ul>
			</div>

			<div class="col-6">
				<h2>Add Product</h2>
				<form:form action="/asoc/${categoria.id }" method="post"
					modelAttribute="asociacion">
					<form:input type="hidden" path="category.id" value="${categoria.id }" />
					<form:select class="form-control" path="product">
						<c:forEach items="${productos }" var="producto">
							<form:option value="${producto.id }">
								<c:out value="${producto.name }">
								</c:out>
							</form:option>
						</c:forEach>
					</form:select>
					<button class="btn btn-success mt-2">Aceptar</button>
				</form:form>

			</div>
		</div>
		<a class="btn btn-primary" href="/">Volver</a>
	</div>

</body>
</html>