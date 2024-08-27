<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro de usuarios</title>
<link href="" type="text/css" rel="stylesheet">
</head>
<body>
<form:form modelAttribute="cliente">
	Por favor ingrese su información a continuación:
	
	<p><strong>Numero de identificación: </strong></p><form:input path="nombre"/>
	<form:errors path="idCliente" ></form:errors>	
	<p><strong>Nombre: </strong></p><form:input path="nombre"/>
	<form:errors path="idCliente" ></form:errors>
	<p><strong>Apellido: </strong></p><form:input path=""/>
	
</form:form>
</body>
</html>