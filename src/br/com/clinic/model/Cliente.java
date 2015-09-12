/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author GENPAC
 */

public class Cliente extends Pessoa{
    
    private Long id;

    public Cliente(String nome, String cpf, String datNas, String telefone, String email, String obs, String pais, String estado, String cidade, String bairro, String rua, String numero, String complemento, String cep) {
        super(nome, cpf, datNas, telefone, email, obs, pais, estado, cidade, bairro, rua, numero, complemento, cep);
    }

    public Cliente() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    
    
    
}
