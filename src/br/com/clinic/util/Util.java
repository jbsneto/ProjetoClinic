/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.util;

import java.text.DateFormat;
import java.util.Date;
/**
 *
 * @author GENPAC
 */
public class Util {
    
    public  static String getDataAtual() { 
                Date now = new Date();
                return DateFormat.getInstance().format(now);
	
    }
    
}
