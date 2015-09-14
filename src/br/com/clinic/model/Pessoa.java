/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.model;

import br.com.clinic.interfac.Base;
import br.com.clinic.util.Util;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author GENPAC
 */


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@MappedSuperclass
public class Pessoa implements Base, Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    //@Column(unique = true, length = 11, nullable = false)
    private String cpf;
    private String obs;
    private String email;
    private String telefone;
    
    @Temporal(TemporalType.DATE)
    private Date dataNas;
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    
    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="endereco_id")  
    private Endereco endereco;
    
    public Pessoa(){
       this.dataCadastro = Util.getDataAtual();
    }

    public Pessoa(long id, String nome, String cpf, String obs, Date dataNas, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.obs = obs;
        this.dataNas = dataNas;
        this.dataCadastro = Util.getDataAtual();
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Date getDataNas() {
        return dataNas;
    }

    public void setDataNas(Date dataNas) {
        this.dataNas = dataNas;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    //public void setDataCadastro(Date dataCadastro) {
    //    this.dataCadastro = dataCadastro;
    //}

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
