/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.model;

import br.com.clinic.util.Util;


/**
 *
 * @author GENPAC
 */

public class ExameCliente {
    
    //Exame da requisição do cliente
    
    private long id;
    private String dataExame;
    private Exame exame;
    private boolean urgencia;
    private String obs;
    private Requisicao lancamento; //Terá acesso ao cliente, medSolicitante

    public ExameCliente(long id, Exame exame, boolean urgencia, String obs, Requisicao lancamento) {
        this.id = id;
        this.dataExame = Util.getDataAtual();
        this.exame = exame;
        this.urgencia = urgencia;
        this.obs = obs;
        this.lancamento = lancamento;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public boolean isUrgencia() {
        return urgencia;
    }

    public void setUrgencia(boolean urgencia) {
        this.urgencia = urgencia;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Requisicao getLancamento() {
        return lancamento;
    }

    public void setLancamento(Requisicao lancamento) {
        this.lancamento = lancamento;
    }
    
    
    
}
