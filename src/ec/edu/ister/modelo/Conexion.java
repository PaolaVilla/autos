/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandra
 */
public class Conexion {
    private Connection conexion = null; 
    public Connection getConexion(){ 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // parametros de la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10281192","sql10281192","LE8z2kZP7i");  
            System.out.println("Conexion realizada");
        } catch(SQLException e){
            System.err.println( e.toString() );
            System.out.println("No se puede acceder al servidor");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return conexion;  
    }
}
