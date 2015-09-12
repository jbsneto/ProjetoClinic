/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.model;

import br.com.clinic.util.Util;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author GENPAC
 */
@Entity
public class Requisicao {
    
    @Id
    private long id;
    private String status;
    private String dataRequisicao;
    private String MedSolicitante;
    private Cliente cliente;
    private List<ExameCliente> listaExame; 

    public Requisicao(long id, String status, String MedSolicitante, Cliente cliente, List<ExameCliente> listaExame) {
        
        this.id = id;
        this.status = status;
        this.dataRequisicao = Util.getDataAtual();
        this.MedSolicitante = MedSolicitante;
        this.cliente = cliente;
        this.listaExame = listaExame;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataRequisicao() {
        return dataRequisicao;
    }

    public void setDataRequisicao(String dataRequisicao) {
        this.dataRequisicao = dataRequisicao;
    }

    public String getMedSolicitante() {
        return MedSolicitante;
    }

    public void setMedSolicitante(String MedSolicitante) {
        this.MedSolicitante = MedSolicitante;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ExameCliente> getListaExame() {
        return listaExame;
    }

    public void setListaExame(List<ExameCliente> listaExame) {
        this.listaExame = listaExame;
    }
    
    
    
}
