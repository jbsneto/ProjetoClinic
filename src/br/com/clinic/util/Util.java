/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.util;

import br.com.clinic.facade.Facade;
import br.com.clinic.model.CidadeEstado;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GENPAC
 */
public class Util {
    
    private static final DateFormat FORMATBR = new SimpleDateFormat("dd/MM/yyyy");
    private static Facade facade = new Facade();
    
    
    public static Date getDataAtual(){
        Date now = new Date();
        return now;
    }

    public static String dateToString(Date date){
        if (date == null)
            return null;
        return FORMATBR.format(date);
    }

    public static Date stringToDate(String str){
        if (str == null || str.equals(""))
            return null;
        try {
            return FORMATBR.parse(str);
        } catch (ParseException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
