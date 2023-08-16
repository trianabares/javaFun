<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
<!--- For Bootstrap CSS --->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<!--- For any Bootstrap that uses JS --->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mx-auto">
<p>Has visitado la web <c:out value="${contador}"></c:out> veces</p>
<a href="/">Volver</a><br>
<a href="/reset">Reset</a>
</div>

</body>
</html>