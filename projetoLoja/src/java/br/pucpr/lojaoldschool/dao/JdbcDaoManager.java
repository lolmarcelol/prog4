package dao;

import br.pucpr.lojaoldschool.dao.ClienteDAO;
import br.pucpr.lojaoldschool.dao.JdbcClienteDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDaoManager implements IDaoManager 
{
    Connection conexão;
    private JdbcClienteDAO clienteDAO;
    public JdbcDaoManager()
    {
    }
    
    
    @Override
    public void iniciar() throws DaoException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/loja";
            conexão = DriverManager.getConnection(url, "root", "root");
            conexão.setAutoCommit(false);
            clienteDAO = new JdbcClienteDAO(conexão);
            //clienteDao.setConexão(conexão);
            
        }
        catch( Exception ex )
        {
            throw new DaoException("Ocorreu um erro ao conectar ao banco de dados:" + 
                    ex.getMessage());
        }
    }

    @Override
    public void encerrar() 
    {
        try {
            if(!conexão.isClosed())
                conexão.close();
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void confirmarTransação() {
        try{
            conexão.commit();
        } catch(SQLException ex){
            throw new DaoException("Ocorreu um erro" + ex.getMessage());
        }       
    }

    @Override
    public void abortarTransação() {
        try{
            conexão.rollback();
        } catch(SQLException ex){
            throw new DaoException("Ocorreu um erro" + ex.getMessage());
        }       
    }
    

    @Override
    public ClienteDAO getClienteDao() {
        return clienteDAO;
    }
        
    
}
