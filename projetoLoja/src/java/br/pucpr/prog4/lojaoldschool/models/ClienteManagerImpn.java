
package br.pucpr.prog4.lojaoldschool.models;

import br.pucpr.lojaoldschool.dao.ClienteDAO;
import br.pucpr.lojaoldschool.dao.IDaoManager;
import br.pucpr.lojaoldschool.dao.JdbcDaoManager;

public class ClienteManagerImpn implements ClienteManager {

    @Override
    public Cliente cadastrar(Cliente cliente){
       IDaoManager manager;
       manager = new JdbcDaoManager();
       
       try{
           manager.iniciar();
           ClienteDAO dao = manager.getClienteDao();
           Cliente c ;
           c = dao.inserir(cliente);
           manager.confirmarTransação();
           manager.encerrar();
           return c;
       }catch(Exception ex){
           manager.abortarTransação();
           throw ex;
       }               
    }
}
