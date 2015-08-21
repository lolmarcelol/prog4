
package br.pucpr.lojaoldschool.controllers;

import br.pucpr.prog4.lojaoldschool.models.IProdutoManager;
import br.pucpr.prog4.lojaoldschool.models.Produto;
import br.pucpr.prog4.lojaoldschool.models.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marcelo.mikosz
 */
public class ProdutoDetalheServlet extends HttpServlet {

   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id;
        String idParam;
        idParam = request.getParameter("id");
        id = Integer.parseInt(idParam);
        
        IProdutoManager manager;
        manager = new ProdutoManager();
        Produto produto;
        produto = manager.obterPorId(id);
        
        request.setAttribute("produto",produto);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/produto_detalhes.jsp");
        rd.forward(request,response);
        
    }


}
