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
<title>P�gina Inicial</title>
</head>
<body>
		 Ol� <%= nomeUsuario %> , Bem-vindo (a)!
	
</body>
</html>