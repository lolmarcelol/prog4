
package br.pucpr.lojaoldschool.controllers;

import br.pucpr.prog4.lojaoldschool.models.Automovel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutomoveLNovoServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/visoes/automovel-novo-form.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String placa;
        placa = request.getParameter("placa");
        String anoFabricaçãoParam;
        anoFabricaçãoParam = request.getParameter("anoFabricacao");
        
        int anoFabricacao;
        anoFabricacao = Integer.parseInt(anoFabricaçãoParam);
        Automovel auto;
        auto = new Automovel();
        auto.setPlaca(placa);
        auto.setAnoFabricacao(anoFabricacao);
        
        EntityManagerFactory fabrica;
        fabrica = Persistence.createEntityManagerFactory("autobd");
        
        EntityManager em;
        em = fabrica.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(auto);
        em.getTransaction().commit();
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/visoes/automovel-listar.jsp");
        rd.forward(request, response);

    }

}
