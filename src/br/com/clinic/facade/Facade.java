/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.facade;

import br.com.clinic.dao.ExameDao;
import br.com.clinic.dao.CargoDao;
import br.com.clinic.dao.CidadeEstadoDao;
import br.com.clinic.dao.FuncionarioDao;
import br.com.clinic.dao.ClienteDao;
import br.com.clinic.dao.ExameClienteDao;
import br.com.clinic.dao.LancamentoDao;
import br.com.clinic.dao.LogExameDao;
import br.com.clinic.dao.SetorDao;

import br.com.clinic.model.Cargo;
import br.com.clinic.model.CidadeEstado;
import br.com.clinic.model.Cliente;
import br.com.clinic.model.Exame;
import br.com.clinic.model.ExameCliente;
import br.com.clinic.model.Funcionario;
import br.com.clinic.model.Lancamento;
import br.com.clinic.model.LogExame;
import br.com.clinic.model.Setor;
import java.util.List;



public class Facade {
    
    private SetorDao daoSetor;
    private CargoDao daoCargo;
    private ClienteDao daoCliente;
    private FuncionarioDao daoFuncionario;
    private ExameDao daoExame;
    private LancamentoDao daoLancamento;
    private ExameClienteDao daoExameCliente;
    private CidadeEstadoDao daoCidadeEstado;
    private LogExameDao daoLogExame;
    
    public Facade() {
        daoCargo = new CargoDao(Cargo.class);
        daoCliente = new ClienteDao(Cliente.class);
        daoSetor = new SetorDao(Setor.class);
        daoFuncionario = new FuncionarioDao(Funcionario.class);
        daoExame = new ExameDao(Exame.class);
        daoLancamento = new LancamentoDao(Lancamento.class);
        daoExameCliente = new ExameClienteDao(ExameCliente.class);
        daoCidadeEstado = new CidadeEstadoDao(CidadeEstado.class);
        daoLogExame = new LogExameDao(LogExame.class);
    }
    
    public void cadastraLog(LogExame e) throws Exception {
         daoLogExame.create(e);
    }
    
    public List<LogExame> listarLog() throws Exception {
         return daoLogExame.getAll();
    }
    
    public void cidadeEstadoCadastrar(CidadeEstado c) throws Exception {
         daoCidadeEstado.create(c);
    }
    
    public List<CidadeEstado> cidadeEstadoListar()throws Exception {
        return daoCidadeEstado.getAll();
    }
    
    public CidadeEstado getCidadeEstado(String nome)throws Exception {
        return daoCidadeEstado.getCodCidade(nome);
    }
    
    //EXAME
     public void exameCadastrar(Exame c) throws Exception {
         //daoClienteJDBC.cadastrarCliente(c);
         daoExame.create(c);
    }

    public Exame exameBuscar(long id) throws Exception {
        //return daoClienteJDBC.buscarCliente(id);
        return daoExame.getIdExame(id);
    }

    public void exameEditar(Exame c) throws Exception {
        //daoClienteJDBC.alterarCliente(c);
        daoExame.update(c);
    }
    
    public void exameDeletar(Exame c) throws Exception {
        //daoClienteJDBC.deletarCliente(c);
        daoExame.delete(c);
    }
    
    public List<Exame> exameListar()throws Exception {
        //return daoClienteJDBC.listarCliente();
        return daoExame.getAll();
    }
    
    //FUNCIONARIO
     public void funcionarioCadastrar(Funcionario f) throws Exception {
         //daoClienteJDBC.cadastrarCliente(c);
         daoFuncionario.create(f);
    }

    public Funcionario funcionarioBuscar(long id) throws Exception {
        //return daoClienteJDBC.buscarCliente(id);
        return daoFuncionario.getIdFuncionario(id);
    }
    
    public Funcionario funcionarioBuscarLogin(String login) throws Exception {
        //return daoClienteJDBC.buscarCliente(id);
        return daoFuncionario.getLoginFuncionario(login);
    }

    public void funcionarioEditar (Funcionario f) throws Exception {
        //daoClienteJDBC.alterarCliente(c);
        daoFuncionario.update(f);
    }
    
    public void funcionarioDeletar(Funcionario f) throws Exception {
        //daoClienteJDBC.deletarCliente(c);
        daoFuncionario.delete(f);
    }
    
    public List<Funcionario> funcionarioListar()throws Exception {
        //return daoClienteJDBC.listarCliente();
        return daoFuncionario.getAll();
    }
    
    //CLIENTE
     public void clienteCadastrar(Cliente c) throws Exception {
         //daoClienteJDBC.cadastrarCliente(c);
         daoCliente.create(c);
    }

    public Cliente clienteBuscar(long id) throws Exception {
        //return daoClienteJDBC.buscarCliente(id);
        return daoCliente.getIdCliente(id);
    }

    public void clienteEditar(Cliente c) throws Exception {
        //daoClienteJDBC.alterarCliente(c);
        daoCliente.update(c);
    }
    
    public void clienteDeletar(Cliente c) throws Exception {
        //daoClienteJDBC.deletarCliente(c);
        daoCliente.delete(c);
    }
    
    public List<Cliente> clienteListar()throws Exception {
        //return daoClienteJDBC.listarCliente();
        return daoCliente.getAll();
    }
    
    //SETOR
     public void setorCadastrar(Setor s) throws Exception {
        //daoSetorJDBC.cadastrarSetor(s);
         daoSetor.create(s);
    }

    public Setor setorBuscar(long id) throws Exception {
        //return daoSetorJDBC.buscarSetor(id);
        return daoSetor.getId(id);
    }
    
    public void setorDeletar(Setor s) throws Exception {
        //daoSetorJDBC.deletarSetor(s);
        daoSetor.delete(s);
    }
    
    public List<Setor> setorListar()throws Exception {
        //return daoSetorJDBC.listarSetor();
        return daoSetor.getAll();
    }

    //CARGO
     public void cargoCadastrar(Cargo c) throws Exception {
        //daoCargoJDBC.cadastrarCargo(c);
         daoCargo.create(c);
    }

    public Cargo cargoBuscar(long id) throws Exception {
        //return daoCargoJDBC.buscarCargo(id);
        return daoCargo.getId(id);

    }
    
    public void cargoDeletar(Cargo c) throws Exception {
        //daoCargoJDBC.deletarCargo(c);
        daoCargo.delete(c);
    }
    
    public List<Cargo> cargoListar()throws Exception {
        //return daoCargoJDBC.listarCargo();
        return daoCargo.getAll();
    }
    
    //LANCAMENTO
    public void lancamentoCadastrar(Lancamento l) throws Exception {
        //daoCargoJDBC.cadastrarCargo(c);
         daoLancamento.create(l);
    }
    
    public void lancamentoEditar(Lancamento l) throws Exception {
        //daoClienteJDBC.alterarCliente(c);
        daoLancamento.update(l);
    }

    public Lancamento lancamentoBuscar(long id) throws Exception {
        //return daoCargoJDBC.buscarCargo(id);
        return daoLancamento.getId(id);

    }
    
    public void lancamentoDeletar(Lancamento l) throws Exception {
        //daoCargoJDBC.deletarCargo(c);
        daoLancamento.delete(l);
    }
    
    public List<Lancamento> lancamentoListar()throws Exception {
        //return daoCargoJDBC.listarCargo();
        return daoLancamento.getAll();
    }

    //EXAMECLIENTE
    public void exameClienteCadastrar(ExameCliente e) throws Exception {
        //daoCargoJDBC.cadastrarCargo(c);
         daoExameCliente.create(e);
    }

    public ExameCliente exameClienteBuscar(long id) throws Exception {
        //return daoCargoJDBC.buscarCargo(id);
        return daoExameCliente.getId(id);
    }
    
    public void exameClienteEditar(ExameCliente e) throws Exception {
        //return daoCargoJDBC.buscarCargo(id);
        daoExameCliente.update(e);
    }
    
    public void exameClienteDeletar(ExameCliente e) throws Exception {
        //daoCargoJDBC.deletarCargo(c);
        daoExameCliente.delete(e);
    }
    
    public List<ExameCliente> exameClienteListar()throws Exception {
        //return daoCargoJDBC.listarCargo();
        return daoExameCliente.getAll();
    }
}
