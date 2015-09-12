/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.test;

import br.com.clinic.dao.ClienteDao;
import br.com.clinic.model.Cliente;
import br.com.clinic.viewer.JfCadConf;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author GENPAC
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
       ClienteDao dao = new ClienteDao();
       Cliente c = new Cliente("nome","cpf","dataNas","telefone","email","obs","pais","estado","cidade","bairro","rua","numero","complemento","cep");
       
       dao.cadastrarCliente(c);
       
        System.out.println(dao.buscarCliente(2));
                
    }
    
}
