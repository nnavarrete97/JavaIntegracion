/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author nicomscr
 */
public final class JavaConnectDb {
    
    
    private static JavaConnectDb conexion = null;
    
    public JavaConnectDb(){}
    
    public static JavaConnectDb getInst(){
        if(conexion == null){
            conexion = new JavaConnectDb();
        }
        
        return conexion;
    }
    
    
    public  Connection getConnection() throws Exception{
        
       
            String url = "jdbc:oracle:thin:@159.89.86.128:4921:xe";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String usuario = "gneil";
            String pass = "ling3";
            
            return DriverManager.getConnection(url, usuario, pass);

             
       
    }
    
    
    
    
    
    
}
