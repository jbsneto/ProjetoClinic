/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.dao;

import br.com.clinic.model.Setor;
import br.com.clinic.util.GenericDAO;

/**
 *
 * @author GENPAC
 */
public class SetorDao extends GenericDAO<Setor>{

    public SetorDao(Class<Setor> classModel){
        super(classModel);
    }
   
}