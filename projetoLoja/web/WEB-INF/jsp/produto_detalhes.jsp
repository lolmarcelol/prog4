<%-- 
    Document   : produtos_detalhes
    Created on : 21/08/2015, 19:06:43
    Author     : marcelo.mikosz
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="br.pucpr.prog4.lojaoldschool.models.Produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalhes</title>
    </head>
    <body>
        
        <p> {produto.nome} </p>
        <p> {produto.preco} </p>
        
    </body>
</html>
