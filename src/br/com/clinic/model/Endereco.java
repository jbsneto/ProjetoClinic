/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.model;

import br.com.clinic.interfac.Base;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author GENPAC
 */
@Entity
public class Endereco implements Serializable, Base {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bairro;
    private String rua;
    private String numero;
    private String cep;
    private String obs;
    @ManyToOne
    private CidadeEstado cidadeEstado;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public CidadeEstado getCidadeEstado() {
        return cidadeEstado;
    }

    public void setCidadeEstado(CidadeEstado cidadeEstado) {
        this.cidadeEstado = cidadeEstado;
    }
    
    
}
