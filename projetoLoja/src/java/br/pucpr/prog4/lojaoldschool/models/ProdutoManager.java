/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaoldschool.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo.mikosz
 */
public class ProdutoManager implements IProdutoManager {
    private List<Produto> produtos;

    public ProdutoManager() {
        produtos = new ArrayList<>();
        Produto p1 = new Produto(1,"kraken",350.00);
        produtos.add(p1);
        Produto p2 = new Produto(2,"Blackwidow",970.80);
        produtos.add(p2);
        Produto p3 = new Produto(3,"Deathadder",300.50);
        produtos.add(p3);

        
    }
    
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    
    
    
      
    
}
