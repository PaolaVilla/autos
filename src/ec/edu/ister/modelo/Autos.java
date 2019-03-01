/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandra
 */
public class Autos extends Conexion{
    
    //ec.edu.ister.modelo
    Vehiculo veh = new Vehiculo();
    
    
    static PreparedStatement preparedStatement = null; // modificar la base de datos
    static ResultSet resultSet = null; // primero saco una consulta *
    Connection conexion = getConexion(); // para llamar a la conexion
    
    public boolean setRegistrarAutos(String grupo, String codigo, String modelo, int cantidad, String color, String motor, double precio, int anio, String potencia, String combustible) {
       
        veh.setGrupo(grupo);
        veh.setCodigo(codigo);
        veh.setModelo(modelo);
        veh.setCantidad(cantidad);
        veh.setColor(color);
        veh.setMotor(motor);
        veh.setPrecio(precio);
        veh.setAnio(anio);
        veh.setPotencia(potencia);
        veh.setCombustible(combustible);

        if (registrarAutos(veh)) 
        {
            JOptionPane.showMessageDialog(null, "Bien!");
            return true;
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Mal!");
            return false;
        }
        
    }
    
        
    public boolean registrarAutos(Vehiculo obParteComp){

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Connection conexion = getConexion();

        String queryRegistro = "INSERT INTO autos (grupo,codigo,modelo,cantidad,color,motor,precio,anio,potencia,combustible) VALUES(?,?,?,?,?,?,?,?,?,?);";    
        try 
        {
            preparedStatement = conexion.prepareStatement(queryRegistro);
            preparedStatement.setString(1, obParteComp.getCodigo());
            preparedStatement.setString(2, obParteComp.getGrupo());
            preparedStatement.setString(3, obParteComp.getModelo());
            preparedStatement.setInt(4, obParteComp.getCantidad());
            preparedStatement.setString(5, obParteComp.getColor());
            preparedStatement.setString(6, obParteComp.getMotor());
            preparedStatement.setDouble(7, obParteComp.getPrecio());
            preparedStatement.setInt(8, obParteComp.getAnio());
            preparedStatement.setString(9, obParteComp.getPotencia());
            preparedStatement.setString(10, obParteComp.getCombustible());
            
            preparedStatement.execute();
            
            return true;
            
        } 
        catch (SQLException evt) 
        {
            System.out.println(evt.toString());
        }
        finally
        { 
            try 
            {
                conexion.close();
            } 
            catch (SQLException evt) 
            {
                System.out.println(evt.toString());
            }
        }
    return false;
    }
    
    
    public boolean setModificarAutos(String grupo, String codigo, String modelo, int cantidad, String color, String motor, double precio, int anio, String potencia, String combustible) {
        
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Connection conexion = getConexion();
        
        
        String queryModifica = "UPDATE autos SET grupo='"+grupo+"',modelo='"+modelo+"',cantidad='"+cantidad+"',color='"+color+"',motor='"+motor+"',precio='"+precio+"',anio='"+anio+"',potencia='"+potencia+"',combustible='"+combustible+"' WHERE codigo='"+codigo+"';";

        try 
        {
            preparedStatement = conexion.prepareStatement(queryModifica);
            
            preparedStatement.execute();
            
            return true;
        } 
        catch (SQLException evt) 
        {
            System.out.println(evt.getMessage());
            return false;
        } 
        finally 
        {
            try 
            {
                conexion.close();
            } 
            catch (SQLException evt) 
            {
                System.out.println(evt.getMessage());
            }
        }
    }
    
    
    
    public boolean setEliminarAutos(String codigo) {
        
        ResultSet resultSet = null;        
        PreparedStatement preparedStatement = null;
        Connection conexion = getConexion();
        
        String queryEliminar = "DELETE FROM autos WHERE  codigo='"+codigo+"';";
        
        try 
        {
            preparedStatement = conexion.prepareStatement(queryEliminar);
            
            preparedStatement.executeUpdate();
            
            return true;
        } 
        catch (SQLException evt) 
        {
            System.out.println(evt.getMessage());
            return false;
        } 
        finally 
        {
            try 
            {
                conexion.close();
            } 
            catch (SQLException evt) 
            {
                System.out.println(evt.getMessage());
            }
        }
    }
    
    public boolean consultaAutos(){
    
        try {
            
        } catch (Exception e) {
        }
        
        finally{
        
        }
        return true;
    }
}
