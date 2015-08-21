<%-- 
    Document   : produtos_lista
    Created on : 14/08/2015, 18:55:54
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Lista de produtos </h1>
        <c:forEach var="produto" items="${produtos}">
            <div>
            <p> ${produto.nome} </p>
            <a href="detalhe?id=${produto.id}">
                <img src="../imagens/${produto.id}.jpg" alt="produto_${produto.id}" width="300" heigth="300" />
            </a>
               <p> RS ${produto.preco}</p>
        </div>
        </c:forEach>
        
   
    </body>
</html>
