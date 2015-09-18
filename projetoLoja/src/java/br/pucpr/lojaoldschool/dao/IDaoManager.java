package br.pucpr.lojaoldschool.dao;

import br.pucpr.lojaoldschool.dao.ClienteDAO;

public interface IDaoManager 
{
    void iniciar();
    void encerrar();
    void confirmarTransação();
    void abortarTransação();
    ClienteDAO getClienteDao();
}
