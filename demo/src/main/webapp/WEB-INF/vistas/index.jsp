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
		<form action="cliente" method="get">
			<input type="submit" value="Cliente"/>
		</form>
		<form action="administrativo" method="get">
			<input type="submit" value="Administrativo">
		</form>
	</main>
</body>
</html>