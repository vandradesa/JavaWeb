<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
//scriptlet
String nomeUsuario = (String)request.getAttribute("usuario");
System.out.println(nomeUsuario);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página Inicial</title>
</head>
<body>
		 Olá <%= nomeUsuario %> , Bem-vindo (a)!
	
</body>
</html>