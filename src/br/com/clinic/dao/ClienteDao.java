/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.dao;

import br.com.clinic.model.Cliente;
import br.com.clinic.util.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author GENPAC
 */
public class ClienteDao{
    
    private java.sql.Connection con;
    private ConnectionFactory connection;
    
    
    public void cadastrarCliente(Cliente c) throws Exception {

        // obtem conexão
        con = ConnectionFactory.getConnection(); 

        // define comando sql
        String sql = "insert into cliente (nome,cpf,datanas,datacadastro,telefone,email,obs,cidade,bairro,rua,numero,cep) values (?,?,?,?,?,?,?,?,?,?,?,?);";

        // "prepara" comando a ser executado (o segundo parametro indica que ao inserir, será possível obter o id gerado no banco)
        PreparedStatement st = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        // preenche o statement

        // String nome, String cpf, String end.cidade, String end.bairro, String end.rua, String end.numero, String end.cep
        st.setString(1, c.getNome());
        st.setString(2, c.getCpf());
        st.setString(3, c.getDataNas());
        st.setString(4, c.getDataCadastro());
        st.setString(5, c.getTelefone());
        st.setString(6, c.getEmail());
        st.setString(7, c.getObs());
        st.setString(8, c.getCidade());
        st.setString(9, c.getBairro());
        st.setString(10, c.getRua());
        st.setString(11, c.getNumero());
        st.setString(12, c.getCep());

        // execute o comando
        st.executeUpdate();

        // recupera o id gerado no banco em um "resultSet", objeto que permite ler os resultados de uma consulta
        ResultSet rs = st.getGeneratedKeys();
        if(rs.next())    
            c.setId(rs.getLong(1));

        con.close();

    }

    
    public Cliente buscarCliente(long id) throws Exception {

            Cliente c;

            con = ConnectionFactory.getConnection();

            String sql = "select * from cliente where id=?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1,id);

            ResultSet rs = st.executeQuery();

            //fez cliente
            if(rs.next()){
                
                c = new Cliente(
                    rs.getString("nome"), 
                    rs.getString("cpf"), 
                    rs.getString("datanas"), 
                    rs.getString("telefone"),
                    rs.getString("email"), 
                    rs.getString("obs"),
                    rs.getString("cidade"), 
                    rs.getString("bairro"), 
                    rs.getString("rua"), 
                    rs.getString("numero"), 
                    rs.getString("cep")
                );
                c.setId(rs.getLong("id"));

                con.close();
                return c;
            }
            con.close();
            return null;
        
    }

    
    public void alterarCliente(Cliente c) throws Exception {

        // obtem conexão
        con = ConnectionFactory.getConnection();

        // define comando sql
        String sql = "update cliente set "
                + "nome=?,"
                + "cpf=?,"
                + "datanas=?,"
                + "telefone=?,"
                + "email=?,"
                + "obs=?,"
                + "cidade=?,"
                + "bairro=?,"
                + "rua=?,"
                + "numero=?,"
                + "cep=? "
                + "where id=?;";

        // "prepara" comando a ser executado
        PreparedStatement st = con.prepareStatement(sql);

        // preenche o statement
        //nome;cpf;datNas;dataCadastro;telefone;email;obs; pais;estado;cidade;bairro;rua;numero;complemento;cep;
        st.setString(1, c.getNome());
        st.setString(2, c.getCpf());
        st.setString(3, c.getDataNas());
        st.setString(4, c.getTelefone());
        st.setString(5, c.getEmail());
        st.setString(6, c.getObs());
        st.setString(7, c.getCidade());
        st.setString(8, c.getBairro());
        st.setString(9, c.getRua());
        st.setString(10, c.getNumero());
        st.setString(11, c.getCep());
        st.setLong(12, c.getId());

        // execute o comando
        st.executeUpdate();

        con.close();

    }
    
    public void deletarCliente(Cliente c) throws Exception {

            // obtem conexão
           con = ConnectionFactory.getConnection();

           // define comando sql
           String sql = "delete from cliente where id = ?";

           // "prepara" comando a ser executado
           PreparedStatement st = con.prepareStatement(sql);

           // preenche o statement
           st.setLong(1, c.getId());

           // execute o comando
           st.executeUpdate();
           con.close();

    }
    

    public List<Cliente> listarCliente() throws Exception {
        
            con = ConnectionFactory.getConnection();

            List<Cliente> lista = new ArrayList<Cliente>();

            String sql = "select * from cliente";

            PreparedStatement st = this.con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while(rs.next()){
                Cliente c = new Cliente(
                    rs.getString("nome"), 
                    rs.getString("cpf"), 
                    rs.getString("datanas"), 
                    rs.getString("telefone"),
                    rs.getString("email"), 
                    rs.getString("obs"),
                    rs.getString("cidade"), 
                    rs.getString("bairro"), 
                    rs.getString("rua"), 
                    rs.getString("numero"), 
                    rs.getString("cep")
                );
                c.setDataCadastro(rs.getString("dataCadastro"));
                c.setId(rs.getLong("id"));
                lista.add(c);
            }
            con.close();
            return lista;
        
    }
    
    
}