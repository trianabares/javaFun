<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time</title>
<script src="./javascript/javascript.js"></script>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body onload="horaActual()">

<h1 class="hora"><c:out value="${Hora}"></c:out></h1>

</body>
</html>