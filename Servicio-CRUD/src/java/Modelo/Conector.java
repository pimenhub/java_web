/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Jonathan Pimentel
 */
public class Conector {
    private String driver = "com.mysql.jdbc.Driver";
    private String servidor = "localhost";
    private String bd = "prueba_bd";
    private String user = "root";
    private String password = "";
    
    private String cadena;
    
    Connection c;
    Statement st;
    
    public void conectar(){
        cadena = "jdbc:mysql://"+ servidor + "/" + bd;
        try {
            Class.forName(driver).newInstance();
            c = DriverManager.getConnection(cadena, user, password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void desconectar(){
        try {
            c.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
