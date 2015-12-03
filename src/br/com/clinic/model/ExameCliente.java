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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author GENPAC
 */
@Entity
public class ExameCliente implements Base, Serializable {
    
    private static final String op[] = {"PENDENTE", "COLETADO", "EXAMINADO", "ENTREGUE", "EXTRAVIADO"};
    //Exame da requisição do cliente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dataExame;
    @ManyToOne
    private Exame exame;
    private String status;
    private boolean urgencia;
    //@ManyToOne(cascade=CascadeType.ALL)
    //private Lancamento lancamento; //Terá acesso ao cliente, medSolicitante
    
    public void setStatusColetado(){ status = op[1]; }
    public void setStatusExaminado(){ status = op[2]; }
    public void setStatusEntregue(){ status = op[3]; }
    public void setStatusExtraviado(){ status = op[4]; }
    public String getStatus(){ return status; }

    public ExameCliente() {
        dataExame = Util.getDataAtual();
        status = op[0];
    }
    
    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataExame() {
        return dataExame;
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
    
}
