/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.model;

import br.com.clinic.interfac.Base;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author GENPAC
 */
@Entity
public class LogExame implements Serializable, Base {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String statusAntes;
    private String statusDepois;
    @ManyToOne
    private Funcionario funcionario;
    @ManyToOne
    private ExameCliente exameCliente;

    public LogExame() {
    }

    public LogExame(Funcionario funcionario, ExameCliente exameCliente, String antes, String depois) {
        this.funcionario = funcionario;
        this.exameCliente = exameCliente;
        this.statusAntes = antes;
        this.statusDepois = depois;
    }

    public String getStatusAntes() {
        return statusAntes;
    }

    public void setStatusAntes(String statusAntes) {
        this.statusAntes = statusAntes;
    }

    public String getStatusDepois() {
        return statusDepois;
    }

    public void setStatusDepois(String statusDepois) {
        this.statusDepois = statusDepois;
    }
    
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public ExameCliente getExameCliente() {
        return exameCliente;
    }
 
}
