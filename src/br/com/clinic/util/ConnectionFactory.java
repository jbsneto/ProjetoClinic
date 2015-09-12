/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author José
 */
public class ConnectionFactory {
    
    private static final String URL = "jdbc:postgresql://localhost:5432/projetoClinic";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() {
        try {

            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (Exception e) {
            //e.printStackTrace();
            return null;
        }
    }
}
