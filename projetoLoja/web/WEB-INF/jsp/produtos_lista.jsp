<%-- 
    Document   : produtos_lista
    Created on : 14/08/2015, 18:55:54
    Author     : marcelo.mikosz
--%>

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
        <%
        List<Produto> produtos;
        produtos = (List<Produto>) request.getAttribute("Produtos");
        
        for(Produto produto : produtos)
        {
        %>
        
        <div>
            <p> <%=produto.getNome() %> </p>
            <a href="produto_detalhes?id=<%=produto.getId() %>">
               <img src="imagens/0<%=produto.getId()%>.jpg" alt="produto_<%=produto.getId()%>" />
            </a>
               <p> RS <%=produto.getPreco()%></p>
        </div>
            <% } %>
        
        <h1>LISTA DE PRODUTOS</h1>
        <p> kraken pro 7.1 </p>
        <a href="produto_detalhe?id=1">
            <img src="../imagens/kraken.jpg" alt="kraken" width="300" height="300">
        </a>
        <p>R$: 350,00</p>
    </body>
</html>
