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

    public Cliente(long id) {
        this.id = id;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    
    
    
}
