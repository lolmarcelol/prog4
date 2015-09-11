
package br.pucpr.lojaoldschool.dao;

import br.pucpr.prog4.lojaoldschool.models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author marcelo.mikosz
 */
public class JdbcClienteDAO implements ClienteDAO {
    
    private Connection conexão;
    
    public JdbcClienteDAO(Connection conexão){
        this.conexão = conexão;
    }
    @Override
    public Cliente inserir(Cliente cliente) {
        String sql;
        sql = "INSERT INTO PESSOA("
                + "nome,"
                + "tipo,"
                + "sexo,"
                + "cpf,"
                + "comentario)"
                + " VALUES (?,?,?,?,?)";
        PreparedStatement ps;
        try{
            ps = conexão.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTipo());
            ps.setString(3, cliente.getSexo());
            ps.setInt(4,cliente.getCPF());
            ps.setString(5, cliente.getComentario());
            
            ps.executeUpdate();
            return cliente;
        } catch(Exception ex){
            throw new DaoException("Erro ao inserir cliente no banco de dados");
            
        }
        
    }
    

     
}
