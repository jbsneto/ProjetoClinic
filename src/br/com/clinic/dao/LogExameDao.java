/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.dao;

import br.com.clinic.model.LogExame;
import br.com.clinic.util.GenericDAO;

/**
 *
 * @author GENPAC
 */
public class LogExameDao extends GenericDAO<LogExame>{

    public LogExameDao(Class<LogExame> classModel){
        super(classModel);
    }
   
}
