
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Meu cadastro</h1>
        <form action="cadastro" method="POST">
            <label for="PF" id="PF"> Pessoa Física </label>
            <input type="radio" id="PF" name="Pessoa" value="PF"/> 
            <label for="PJ" id="PJ" > Pessoa Jurídica </label>
            <input type="radio" id="PJ" name="Pessoa" value="PJ"/><br>
            <br><label for="Nome" > Nome: </label>
            <input type="text" id="Nome" name="Nome"/> <br>
            <br><label for="CPF" id="CPF">CPF: </label>
            <input type="text" name="CPF" id="CPF" value="CPF"/><br>
            <br><label for="Sexo" id="Sexo">Sexo: </label>
            <select name="Sexo" id="Sexo" >
                <option>Selecione</option>
                <option>Masculino</option>
                <option>Feminino</option>
            </select><br>
            <br><label for="Comentario" id="Comentario">Comentario: </label>
            <textarea type="textarea" name="Comentario" id="Comentario"> </textarea><br>
            <br><input type="submit" value="salvar"/>
        </form>
    </body>
</html>
