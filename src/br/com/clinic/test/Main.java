/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.test;


import br.com.clinic.dao.ClienteDao;
import br.com.clinic.facade.Facade;
import br.com.clinic.model.Cargo;
import br.com.clinic.model.CidadeEstado;
import br.com.clinic.model.Cliente;
import br.com.clinic.model.Endereco;
import br.com.clinic.model.Exame;
import br.com.clinic.model.ExameCliente;
import br.com.clinic.model.Funcionario;
import br.com.clinic.model.Lancamento;
import br.com.clinic.model.Setor;
import br.com.clinic.util.Util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author GENPAC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
       Facade facade = new Facade();
       /*List<ExameCliente> list = new ArrayList<ExameCliente>();
       
       Exame e = new Exame();
       e.setNome("aaaaa");
       facade.exameCadastrar(e);

       Exame eq = new Exame();
       e.setNome("qqqqq");
       facade.exameCadastrar(eq);
        
       ExameCliente item = new ExameCliente();
       item.setExame(e);
       item.setUrgencia(true);
       
       ExameCliente items = new ExameCliente();
       items.setExame(eq);
       item.setUrgencia(true);
       
       list.add(item);
       list.add(items);
       
       
       
       Lancamento l = new Lancamento();
       l.setListExame(list);
       
       facade.lancamentoCadastrar(l);
       
       
       
       Cliente c = new Cliente();
       Endereco e = new Endereco();
       e.setCidade("wqeq");
       c.setNome("ewqewq");
       c.setEndereco(e);
       
       facade.ClienteCadastrar(c);
       
        System.out.println(facade.CargoListar());*/
        
       
       
        /*Cargo c = facade.cargoBuscar(3);
        Funcionario f = new Funcionario();
        Endereco e = new Endereco();
        e.setCidade("Patos");
        f.setNome("Brunna Ingreubfds fds");
        f.setCargo(c);
        f.setEndereco(e);
        facade.funcionarioCadastrar(f);
        System.out.println(facade.funcionarioBuscar(f.getId()));
        
        Funcionario fun = facade.funcionarioBuscar(4);
        fun.setNome("juanita");
        fun.getEndereco().setNumero("0210");
        fun.setCargo(facade.cargoBuscar(6));
        
        facade.funcionarioEditar(fun);
        
        facade.funcionarioDeletar(fun);

        
       //ClienteDao dao = new ClienteDao();
       //Cliente c = new Cliente("nome","cpf","dataNas","telefone","email","obs","cidade","bairro","rua","numero","cep");
       
       //dao.cadastrarCliente(c);
       
       // System.out.println(dao.buscarCliente(2))
        
        /*
        
        
        
        Setor y = new Setor();
        y.setNome("Hematologia1");
        facade.SetorCadastrar(y);
        
        System.out.println("ID: " + facade.SetorBuscar(y.getId()).getNome() );
        
        Cargo x = new Cargo();
        x.setNome("Biomédico Hematologista1");
        x.setSalario(2.800);
        x.setSetor(y);
        facade.CargoCadastrar(x);
        
        */
       
       /*c.setNome("Neto");
       c.setDataNas(Util.stringToDate("28/05/1995"));
       e.setCidade("patos");
       c.setEndereco(e);
       
       facade.ClienteCadastrar(c);
       */

        
       
        
    }
 
    
}
