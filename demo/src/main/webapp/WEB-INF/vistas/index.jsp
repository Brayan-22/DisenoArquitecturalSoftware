<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenido</title>
</head>
<body>
	<header>
	<h1>Bienvenido al restaurante de comida rapida</h1>
	</header>
	<main>
		<h2></h2>
		<form action="${pageContext.servletContext.contextPath}/cliente/inicio" method="get">
			<input type="submit" value="Cliente"/>
		</form>
		<form action="${pageContext.servletContext.contextPath}/producto/inicio" method="get">
			<input type="submit" value="Producto"/>
		</form>
	</main>
</body>
</html>