/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.model;

import br.com.clinic.util.Util;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author GENPAC
 */

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String dataNas;
    private String dataCadastro;
    private String telefone;
    private String email;
    private String obs; 
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String cep;

    public Pessoa(){
        this.dataCadastro = Util.getDataAtual();
    }
    
    public Pessoa(String nome, String cpf, String dataNas, String telefone, String email, String obs, String cidade, String bairro, String rua, String numero, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNas = dataNas;
        this.dataCadastro = Util.getDataAtual();
        this.telefone = telefone;
        this.email = email;
        this.obs = obs;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
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

    public String getDataNas() {
        return dataNas;
    }

    public void setDataNas(String datNas) {
        this.dataNas = datNas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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
    
    
    
}
