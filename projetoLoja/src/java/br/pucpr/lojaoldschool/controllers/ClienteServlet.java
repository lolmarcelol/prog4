
package br.pucpr.lojaoldschool.controllers;

import br.pucpr.prog4.lojaoldschool.models.Cliente;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteServlet extends HttpServlet {

     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/ClienteForm.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Cliente cliente = new Cliente();
       cliente.setTipo(request.getParameter("Pessoa")); // parametro que esta no campo name
       cliente.setNome(request.getParameter("Nome"));
       cliente.setSexo(request.getParameter("Sexo"));
       cliente.setComentario(request.getParameter("Comentario"));
       String CPFaux;
       CPFaux = request.getParameter("CPF");
       int CPF =Integer.parseInt(CPFaux);
       cliente.setCPF(CPF);
       
       /*SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
       try{
           Date dataNasc;
           dataNasc = request.getParameter("Data");
       dataFormatada.parse(dataNasc);
       }catch(ParseException ex){
           Logger.getLogger(ClienteServlet.class.getName()).Log();
       }*/
    }

}
