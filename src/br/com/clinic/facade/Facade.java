/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.facade;

import br.com.clinic.dao.CargoDao;
import br.com.clinic.dao.ClienteDao;
import br.com.clinic.dao.ExameDao;
import br.com.clinic.dao.FuncionarioDao;
import br.com.clinic.dao.SetorDao;

import br.com.clinic.model.Cargo;
import br.com.clinic.model.Cliente;
import br.com.clinic.model.Exame;
import br.com.clinic.model.Funcionario;
import br.com.clinic.model.Setor;
import java.util.List;



public class Facade {
    
    private ClienteDao daoCliente;
    
    public Facade() {
        daoCliente = new ClienteDao();
    }
    
     public void ClienteCadastrar(Cliente c) throws Exception {
        daoCliente.cadastrarCliente(c);
    }

    public Cliente ClienteBuscar(long id) throws Exception {
        return daoCliente.buscarCliente(id);
    }

    public void ClienteEditar(Cliente c) throws Exception {
        daoCliente.alterarCliente(c);
    }
    
    public void ClienteDeletar(Cliente c) throws Exception {
        daoCliente.deletarCliente(c);
    }
    
    public List<Cliente> ClienteListar()throws Exception {
        return daoCliente.listarCliente();
    }
    

}
