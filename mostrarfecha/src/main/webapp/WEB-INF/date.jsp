<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date</title>
<script src="./javascript/javascript.js"></script>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body onload="fechaActual()">

<h1 class="fecha"><c:out value="${Fecha}"></c:out></h1>

</body>
</html>