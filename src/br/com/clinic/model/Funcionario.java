/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.model;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author GENPAC
 */

public class Funcionario{
    

    private Long id;
    private String dataFIm;
    private Cargo cargo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataFIm() {
        return dataFIm;
    }

    public void setDataFIm(String dataFIm) {
        this.dataFIm = dataFIm;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    
    
    
}
